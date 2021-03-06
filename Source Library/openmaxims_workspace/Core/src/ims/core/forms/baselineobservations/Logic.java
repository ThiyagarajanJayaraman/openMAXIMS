//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.70 build 3467.22451)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.core.forms.baselineobservations;

import ims.admin.forms.applicationusers.GlobalContext.CoreContext;
import ims.configuration.gen.ConfigFlag;
import ims.core.forms.baselineobservations.GenForm.GroupBloodPressureEnumeration;
import ims.core.vo.VSBloodPressure;
import ims.core.vo.VSBloodSugar;
import ims.core.vo.VSLungFunctionTestVo;
import ims.core.vo.VSMetrics;
import ims.core.vo.VSOxygenSaturation;
import ims.core.vo.VSPainLadderVo;
import ims.core.vo.VSPulse;
import ims.core.vo.VSRespirations;
import ims.core.vo.VSTemperature;
import ims.core.vo.VitalSignsVo;
import ims.core.vo.VitalSignsVoCollection;
import ims.core.vo.lookups.CBGType;
import ims.core.vo.lookups.VSType;
import ims.core.vo.lookups.VSTypeCollection;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.MessageButtons;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.DateTime;

import java.util.ArrayList;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		open();
	}
	private void open() throws PresentationLogicException 
	{
		form.setMode(FormMode.VIEW);
		clearAll();	
		VitalSignsVoCollection voColl = domain.listVitalSigns(form.getGlobalContext().Core.getCurrentCareContext());	
		
		form.recbrHistory().clear();
		for (int i = 0; i < voColl.size(); i++)
		{
			VitalSignsVo vo = voColl.get(i);			
			form.recbrHistory().newRow(voColl.get(i), getAuthoring(vo));
		}
		
		if (form.getLocalContext().getEditedRecordIsNotNull())
			form.recbrHistory().setValue(form.getLocalContext().getEditedRecord());
			
		
		if (form.recbrHistory().getSelectedIndex() >= 0)
			vitallSignsValueChanged();		

		updateControlState();
	}
	
	private String getAuthoring(VitalSignsVo vo)
	{
		StringBuffer sb = new StringBuffer();
		if(vo != null)
		{
			if(vo.getAuthoringInformationIsNotNull())
			{
				if (vo.getAuthoringInformation().getAuthoringHcpIsNotNull())
				{
					sb.append(vo.getAuthoringInformation().getAuthoringHcp().toString());
				}
			
				if (vo.getVitalsTakenDateTimeIsNotNull())
				{
					sb.append(" " + vo.getVitalsTakenDateTime().toString());
				}
			}			
		}
		
		return sb.toString();
	}
	
	private void initialize() throws PresentationLogicException 
	{				
		form.getGlobalContext().Core.setIdForm(form.getForms().Core.BaselineObservations.getID()); //WDEV-7526
		form.cc1().setIsRequiredPropertyToControls(true);
		form.setcc1Enabled(false);
		form.getLocalContext().setEditedRecord(null); //WDEV-7526
	}
	private void clearAll() throws PresentationLogicException 
	{
		form.decTemperature().setValue(null);
		form.intPulseRadial().setValue(null);
		form.intPulseApex().setValue(null);
		form.intRespiration().setValue(null);
		form.intPeakFlowPre().setValue(null);
		form.intPeakFlowPost().setValue(null);
		form.intPeakFlowTime().setValue(null);
				
		form.intBloodPressureLyingFirst().setValue(null);
		form.intBloodPressureLyingSecond().setValue(null);
		form.intBloodPressureStandingFirst().setValue(null);
		form.intBloodPressureStandingSecond().setValue(null);
		
		form.intOxygenSaturation().setValue(null);
		form.intRate().setValue(null);
		
		form.decHeight().setValue(null);
		form.decWeight().setValue(null);
		form.decBloodGlucose().setValue(null);
		form.decBMI().setValue(null);
		form.cmbPainScore().setValue(null);
		
		form.chkIrregular().setValue(false);
		form.chkOnFiO2().setValue(false);
		form.cc1().setValue(null); //WDEV-7526
		form.dtim1().setValue(null); //WDEV-7526
		
		
		onChkOnFiO2ValueChanged();
	}
	
	private void displayRecord(VitalSignsVo voVitalSign) throws PresentationLogicException
	{
		clearAll();
		
		if (voVitalSign == null) //WDEV-7526
		return;                 //WDEV-7526
		
		form.cc1().setValue(voVitalSign.getAuthoringInformationIsNotNull() ? voVitalSign.getAuthoringInformation() : null);
		form.dtim1().setValue(voVitalSign.getVitalsTakenDateTime());				
		form.decTemperature().setValue(voVitalSign.getTemperature() != null ? voVitalSign.getTemperature().getTemperature() : null);
		
		
		if (voVitalSign.getPain() != null)
		{
			if (voVitalSign.getPain().getPainIsNotNull())
			{
				form.cmbPainScore().setValue(voVitalSign.getPain().getPain());
			}
		}
		
		if (voVitalSign.getPulse() != null)
		{			
			form.intPulseRadial().setValue(voVitalSign.getPulse().getPulseRateRadialIsNotNull() ? voVitalSign.getPulse().getPulseRateRadial() : null);			
			form.intPulseApex().setValue(voVitalSign.getPulse().getPulseRateApex() != null ? voVitalSign.getPulse().getPulseRateApex() : null);			
			form.chkIrregular().setValue(voVitalSign.getPulse().getIsIrregular() != null ? voVitalSign.getPulse().getIsIrregular().booleanValue() : false);			
		}

		if (voVitalSign.getBloodPressure() != null)
		{
			// Siting
			if (voVitalSign.getBloodPressure().getBPSittingSysIsNotNull())
			{
				form.GroupBloodPressure().setValue(GenForm.GroupBloodPressureEnumeration.rdoSitting);
				onRadioButtonGroupBloodPressureValueChanged();		
				form.intBloodPressureLyingSecond().setValue(new Integer(voVitalSign.getBloodPressure().getBPSittingDias().intValue()));
				form.intBloodPressureLyingFirst().setValue(new Integer(voVitalSign.getBloodPressure().getBPSittingSys().intValue()));
			}
			else
			{
				form.GroupBloodPressure().setValue(GenForm.GroupBloodPressureEnumeration.rdoLyingStanding);
				onRadioButtonGroupBloodPressureValueChanged();
			
				// Standing
				form.intBloodPressureStandingSecond().setValue(voVitalSign.getBloodPressure().getBPStandingDias() != null ? new Integer(voVitalSign.getBloodPressure().getBPStandingDias().intValue()) : null);				
				form.intBloodPressureStandingFirst().setValue(voVitalSign.getBloodPressure().getBPStandingSys() != null ? new Integer(voVitalSign.getBloodPressure().getBPStandingSys().intValue()) : null);

				// Lying
				form.intBloodPressureLyingSecond().setValue(voVitalSign.getBloodPressure().getBPLyingDias() != null ? new Integer(voVitalSign.getBloodPressure().getBPLyingDias().intValue()) :  null);				
				form.intBloodPressureLyingFirst().setValue(voVitalSign.getBloodPressure().getBPLyingSys() != null ? new Integer(voVitalSign.getBloodPressure().getBPLyingSys().intValue()) : null);
			}	
		}
		
		//WDEV-7526 
		else
		{
			form.GroupBloodPressure().setValue(GenForm.GroupBloodPressureEnumeration.rdoSitting);
			onRadioButtonGroupBloodPressureValueChanged();
		}
		//ends here
		 
		 
		
		form.intRespiration().setValue(voVitalSign.getRespiratory() != null ? voVitalSign.getRespiratory().getRespRate() : null);
		form.intPeakFlowPre().setValue(voVitalSign.getLungFunctionTest() != null ? voVitalSign.getLungFunctionTest().getPeakFlowPre() :  null);
		form.intPeakFlowPost().setValue(voVitalSign.getLungFunctionTest() != null ? voVitalSign.getLungFunctionTest().getPeakFlowPost() : null);
		form.intPeakFlowTime().setValue(voVitalSign.getLungFunctionTest() != null ? voVitalSign.getLungFunctionTest().getTimeInterval() : null);			
		form.decHeight().setValue(voVitalSign.getMetrics() != null ? voVitalSign.getMetrics().getHeightValue() : null);
		form.decWeight().setValue(voVitalSign.getMetrics() != null ? voVitalSign.getMetrics().getWeightValue() : null);
		
		if (voVitalSign.getMetricsIsNotNull() && voVitalSign.getMetrics().getBMIIsNotNull())
		{			
			form.decBMI().setValue(voVitalSign.getMetrics().getBMI());			
		}		
		
		form.decBloodGlucose().setValue(voVitalSign.getBloodSugar() != null ? voVitalSign.getBloodSugar().getBloodSugarValue() : null);
		form.intOxygenSaturation().setValue(voVitalSign.getOxygenSaturation() != null ? voVitalSign.getOxygenSaturation().getOxygenSaturationLevel() : null);
		form.chkOnFiO2().setValue(voVitalSign.getOxygenSaturation() != null ? voVitalSign.getOxygenSaturation().getIsOnFiO2() : null);
		form.intRate().setValue(voVitalSign.getOxygenSaturation() != null ? voVitalSign.getOxygenSaturation().getFractionRate() : null);
	}
	
	@Override
	protected void onFormModeChanged()
	{
		updateControlState();		
	}
	
	@Override
	protected void onChkOnFiO2ValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlState();
	}
	
	private void updateControlState()
	{
		if (form.getMode().equals(FormMode.EDIT))
		{
			form.intRate().setEnabled(form.chkOnFiO2().getValue());
			form.btnBMI().setEnabled(true);
			
			//WDEV-7526
			form.intBloodPressureLyingFirst().setEnabled(GroupBloodPressureEnumeration.rdoSitting.equals(form.GroupBloodPressure().getValue())
					|| GroupBloodPressureEnumeration.rdoLyingStanding.equals(form.GroupBloodPressure().getValue()));
			form.intBloodPressureLyingSecond().setEnabled(GroupBloodPressureEnumeration.rdoSitting.equals(form.GroupBloodPressure().getValue())
					|| GroupBloodPressureEnumeration.rdoLyingStanding.equals(form.GroupBloodPressure().getValue()));

			form.intBloodPressureStandingSecond().setEnabled(GroupBloodPressureEnumeration.rdoLyingStanding.equals(form.GroupBloodPressure().getValue()));			
			form.intBloodPressureStandingFirst().setEnabled(GroupBloodPressureEnumeration.rdoLyingStanding.equals(form.GroupBloodPressure().getValue()));
			// ends here
			
			if (form.chkOnFiO2().getValue() == false) {
				form.intRate().setValue(null);			
			}
		}	
		else
		{
			form.intBloodPressureLyingSecond().setEnabled(false);
			form.intBloodPressureLyingFirst().setEnabled(false);
			form.intBloodPressureStandingSecond().setEnabled(false);
			form.intBloodPressureStandingFirst().setEnabled(false);
			form.btnEdit().setVisible(form.recbrHistory().getValue() != null ?  true : false);
		}
		
		form.cc1().setEnabledAuthoringHCP(form.getMode().equals(FormMode.EDIT) ? true : false);
		form.cc1().setEnabledDateTime(form.getMode().equals(FormMode.EDIT) ? true : false);
	}
		
	@Override
	protected void onRadioButtonGroupBloodPressureValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		boolean isEditMode = form.getMode().equals(FormMode.EDIT) ?  true : false;
		
		if (form.GroupBloodPressure().getValue().equals(GenForm.GroupBloodPressureEnumeration.rdoSitting))
		{
			form.intBloodPressureStandingSecond().setVisible(false);
			form.intBloodPressureStandingFirst().setVisible(false);
			form.intBloodPressureLyingSecond().setEnabled(isEditMode);
			form.intBloodPressureLyingFirst().setEnabled(isEditMode);
			
			form.lblSlash2().setVisible(false);
			form.lblLying().setValue("Sitting");
			form.lblStanding().setVisible(false);			
		}
		else
		{
			form.intBloodPressureStandingSecond().setVisible(true);			
			form.intBloodPressureStandingFirst().setVisible(true);			
			form.intBloodPressureStandingSecond().setEnabled(isEditMode);			
			form.intBloodPressureStandingFirst().setEnabled(isEditMode);
		
			form.lblSlash2().setVisible(true);
			form.lblLying().setValue("Lying");
			form.lblStanding().setVisible(true);
		}
		
		clearRadioButtonGroupBloodPressure();
	}
	
	private void clearRadioButtonGroupBloodPressure() 
	{
		form.intBloodPressureLyingSecond().setValue(null);		
		form.intBloodPressureLyingFirst().setValue(null);
		form.intBloodPressureStandingSecond().setValue(null);
		form.intBloodPressureStandingFirst().setValue(null);
	}
	
	@Override
	protected void onBtnCancelClick() throws PresentationLogicException 
	{
		form.setMode(FormMode.VIEW);
		open();
	}
	
	@Override
	protected void onBtnNewClick() throws PresentationLogicException 
	{
		form.setMode(FormMode.EDIT);
		newInstance();			
	}
	private void newInstance() throws PresentationLogicException 
	{
		clearAll();		
		form.cc1().initializeComponent();
		form.getLocalContext().setEditedRecord(null);
		form.setcc1Enabled(true);
		form.dtim1().setValue(new DateTime());
		form.GroupBloodPressure().setValue(GenForm.GroupBloodPressureEnumeration.rdoSitting);
		onRadioButtonGroupBloodPressureValueChanged();
	}
	
	private String[] getUIErrors(VSTypeCollection recordedSigns) 
	{
		ArrayList<String> errors = new ArrayList<String>();
		errors = getScreenDataErrors(errors);
		if (recordedSigns.size() == 0) 
		{
			errors.add("No Vital Signs values entered");
		}
		
		if (errors.size() > 0) 
		{
			String[] err = new String[errors.size()];		
			errors.toArray(err);
			return err;
		}
		
		return null;
	}
	
	private ArrayList<String> getScreenDataErrors(ArrayList<String> errors) 
	{
		if (form.dtim1().getValue() != null)
		{
			if (form.dtim1().getValue().isGreaterThan(new DateTime()))
			{
				errors.add("'Date/Time taken' can not be in the future.");				
			}
		}
		if ((form.intBloodPressureLyingSecond().getValue() != null && form.intBloodPressureLyingFirst().getValue() == null) || 
				(form.intBloodPressureLyingSecond().getValue() == null && form.intBloodPressureLyingFirst().getValue() != null))
		{
			if (form.GroupBloodPressure().getValue().equals(GenForm.GroupBloodPressureEnumeration.rdoSitting)) {
				errors.add("Please enter both Blood Pressure values for Sitting.");
			}
			else {
				errors.add("Please enter both Blood Pressure values for Lying.");
			}
		}
		if ((form.intBloodPressureStandingSecond().getValue() != null && form.intBloodPressureStandingFirst().getValue() == null) ||
					(form.intBloodPressureStandingSecond().getValue() == null && form.intBloodPressureStandingFirst().getValue() != null))
		{
			errors.add("Please enter both Blood Pressure values for Standing.");
		}
		if (form.chkOnFiO2().getValue())
		{
			if (form.intRate().getValue() == null) {
				errors.add("Please enter value for Oxygen Saturation % rate.");
			}
		}
		if (form.decHeight().getValue() != null || form.decWeight().getValue() != null)
		{
			if (form.decHeight().getValue() == null || form.decWeight().getValue() == null) 
			{
				errors.add("Please enter both Height and Weight for Metrics.");
			}
			else
			{
				if ((form.decHeight().getValue() == 0 || form.decHeight().getValue() < 1) ||
						(form.decWeight().getValue() == 0 || form.decWeight().getValue() < 0))
				{
					errors.add("A non-zero and greather than 1 value needs to be specified for Height and Weight");					
				}
			}
		}		
		return errors;
	}
	
	@Override
	protected void onBtnSaveClick() throws PresentationLogicException 
	{		

		ArrayList<String> screenErrors = new ArrayList<String>();
		screenErrors = getScreenDataErrors(screenErrors);
		if (screenErrors != null && screenErrors.size() > 0)
		{
			String[] err = new String[screenErrors.size()];		
			screenErrors.toArray(err);
			engine.showErrors(err);					
			return;
		}

		VitalSignsVo voVitalSign = null;
		
		if (form.getLocalContext().getEditedRecordIsNotNull()) 
			voVitalSign = form.getLocalContext().getEditedRecord();
		else 
			voVitalSign = new VitalSignsVo();
		
		VSTypeCollection recordedSigns = new VSTypeCollection();
		
		if ((form.intBloodPressureLyingSecond().getValue() == null) && 
				(form.intBloodPressureLyingFirst().getValue() == null) &&
					(form.intBloodPressureStandingSecond().getValue() == null) &&
						(form.intBloodPressureStandingFirst().getValue() == null))
		{
			voVitalSign.setBloodPressure(null);
		}
		else
		{
			VSBloodPressure voBP = new VSBloodPressure();
			if (form.GroupBloodPressure().getValue().equals(GenForm.GroupBloodPressureEnumeration.rdoSitting))
			{
				voBP.setBPSittingDias(new Float(form.intBloodPressureLyingSecond().getValue().intValue()));
				voBP.setBPSittingSys(new Float(form.intBloodPressureLyingFirst().getValue().intValue()));
			}
			else
			{				
				voBP.setBPLyingDias(form.intBloodPressureLyingSecond().getValue() != null ? new Float(form.intBloodPressureLyingSecond().getValue().intValue()) : null);			
				voBP.setBPLyingSys(form.intBloodPressureLyingFirst().getValue() != null ? new Float(form.intBloodPressureLyingFirst().getValue().intValue()) : null);			
			}			
						
			voBP.setBPStandingDias(form.intBloodPressureStandingSecond().getValue() != null ? new Float(form.intBloodPressureStandingSecond().getValue().intValue()) : null);			
			voBP.setBPStandingSys(form.intBloodPressureStandingFirst().getValue() != null ? new Float(form.intBloodPressureStandingFirst().getValue().intValue()) : null);
			
			voVitalSign.setBloodPressure(voBP);
			recordedSigns.add(VSType.BP);
		}		
		
		if (form.cmbPainScore().getValue() == null)
		{
			voVitalSign.setPain(null);
		}
		else
		{
			VSPainLadderVo vo = new VSPainLadderVo();
			vo.setPain(form.cmbPainScore().getValue());
			voVitalSign.setPain(vo);
			recordedSigns.add(VSType.PAIN);
		}
		
		if ((form.intPulseRadial().getValue() == null) && (form.intPulseApex().getValue() == null))
		{
			voVitalSign.setPulse(null);
		}
		else
		{
			VSPulse voPulse = new VSPulse();

			voPulse.setPulseRateRadial(form.intPulseRadial().getValue() != null ? form.intPulseRadial().getValue() :  null);
			voPulse.setPulseRateApex(form.intPulseApex().getValue() != null ? form.intPulseApex().getValue() : null);
			voPulse.setIsIrregular(new Boolean(form.chkIrregular().getValue()));
			voVitalSign.setPulse(voPulse);
			recordedSigns.add(VSType.PULSE);
		}
		
		if ((form.intPeakFlowPre().getValue() == null) && (form.intPeakFlowPost().getValue() == null) && (form.intPeakFlowTime().getValue() == null))
		{		
			voVitalSign.setLungFunctionTest(null);
		}		
		else
		{
			VSLungFunctionTestVo voLungFunction = new VSLungFunctionTestVo();

			voLungFunction.setPeakFlowPre(form.intPeakFlowPre().getValue() != null ? form.intPeakFlowPre().getValue() : null);
			voLungFunction.setPeakFlowPost(form.intPeakFlowPost().getValue() != null ? form.intPeakFlowPost().getValue() : null);
			voLungFunction.setTimeInterval(form.intPeakFlowTime().getValue() != null ? form.intPeakFlowTime().getValue() : null);
			voVitalSign.setLungFunctionTest(voLungFunction);
			recordedSigns.add(VSType.PEAKFLOW);
		}
		if (form.decTemperature().getValue() == null)
		{
			voVitalSign.setTemperature(null);
		}
		else
		{
			VSTemperature voTemperature = new VSTemperature();
			
			voTemperature.setTemperature(form.decTemperature().getValue() != null ? form.decTemperature().getValue() : null);
			voVitalSign.setTemperature(voTemperature);
			recordedSigns.add(VSType.TEMP);
		}
		
		if (form.intRespiration().getValue() == null)
		{
			voVitalSign.setRespiratory(null);
		}
		else
		{
			VSRespirations voResp = new VSRespirations();
			
			voResp.setRespRate(form.intRespiration().getValue() != null ? form.intRespiration().getValue() : null);
			voVitalSign.setRespiratory(voResp);
			recordedSigns.add(VSType.RESPIRATION);
		}
		
		if (form.intOxygenSaturation().getValue() == null && form.intRate().getValue() == null)
		{
			voVitalSign.setOxygenSaturation(null);
		}
		else
		{			
			VSOxygenSaturation voOxygen = new VSOxygenSaturation();
			
			voOxygen.setOxygenSaturationLevel(form.intOxygenSaturation().getValue() != null ? form.intOxygenSaturation().getValue() : null);
			voOxygen.setFractionRate(form.intRate().getValue() != null ? form.intRate().getValue() : null);
			voOxygen.setIsOnFiO2(form.chkOnFiO2().getValue());
			voVitalSign.setOxygenSaturation(voOxygen);
			recordedSigns.add(VSType.OXYGEN);
		}		

		if (form.decBloodGlucose().getValue() == null)
		{
			voVitalSign.setBloodSugar(null);
		}
		else
		{
			VSBloodSugar voBloodSugar = new VSBloodSugar();
			
			voBloodSugar.setType(CBGType.RANDOM);
			voBloodSugar.setBloodSugarValue(form.decBloodGlucose().getValue()  != null ? form.decBloodGlucose().getValue() : null);
			voVitalSign.setBloodSugar(voBloodSugar);
			recordedSigns.add(VSType.BLOODSUGAR);
		}		

		if ((form.decHeight().getValue() == null) && (form.decWeight().getValue() == null))
		{
			voVitalSign.setMetrics(null);
		}
		else
		{			
			VSMetrics voMetrics = new VSMetrics();
			
			voMetrics.setHeightValue(form.decHeight().getValue() != null ? form.decHeight().getValue() : null);
			voMetrics.setWeightValue(form.decWeight().getValue() != null ? form.decWeight().getValue() : null);
			voMetrics.setBMI(bodyMassIndex(form.decHeight().getValue().floatValue(), form.decWeight().getValue().floatValue()));
			voMetrics.setSurfaceArea(bodySurfaceArea(form.decHeight().getValue().floatValue(), form.decWeight().getValue().floatValue()));
			voMetrics.setHeightEstimatedMeasured(Boolean.TRUE); // default to measured
			voMetrics.setWeightEstimatedMeasured(Boolean.TRUE); // default to measured
			voMetrics.setPatient(form.getGlobalContext().Core.getPatientShort());
			voVitalSign.setMetrics(voMetrics);
			recordedSigns.add(VSType.METRICS);		
		}
		
		voVitalSign.setAuthoringInformation(form.cc1().getValue());
		voVitalSign.setVitalsTakenDateTime(form.dtim1().getValue());

		voVitalSign.setClinicalContact(form.getGlobalContext().Core.getCurrentClinicalContactIsNotNull() ? form.getGlobalContext().Core.getCurrentClinicalContact() : null);
		voVitalSign.setCareContext(form.getGlobalContext().Core.getCurrentCareContext());
		voVitalSign.setRecordedSigns(recordedSigns);

		String[] str = voVitalSign.validate(getUIErrors(recordedSigns));
		if (str != null && str.length > 0)
		{
			engine.showErrors(str);					
			return;
		}
				
		try
		{
			voVitalSign = domain.saveVitalSign(voVitalSign);
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return;
		}
		
		form.getLocalContext().setEditedRecord(voVitalSign);				
		open();
	}
	
	private Float bodySurfaceArea(float height/* cm */, float weight/* kg */)
	{
		// we have to convert the HEIGHT from cm to m as the formula requires m
		return new Float((float) (0.20247 * Math.pow(height / 100.0, 0.725) * Math.pow(weight, 0.425)));
	}
	
	private Float bodyMassIndex(float height/* cm */, float weight/* kg */)
	{
		if (height==0 || weight==0)
			return null;
		// we have to convert the HEIGHT from cm to m as the formula requires m
		return new Float((float) (weight / (height / 100.0 * height / 100.0)));
	}
	
	@Override
	protected void onBtnEditClick() throws PresentationLogicException 
	{
		form.setMode(FormMode.EDIT);		
	}
	
	@Override
	protected void onRecbrHistoryValueChanged() throws PresentationLogicException 
	{
		vitallSignsValueChanged();		
	}
	
	private void vitallSignsValueChanged() throws PresentationLogicException 
	{
	
		form.getLocalContext().setEditedRecord(form.recbrHistory().getValue());
		
		//WDEV-7526
		if (form.getLocalContext().getEditedRecord() != null) 
		{
			form.getGlobalContext().Core.setVitalSign(form.getLocalContext().getEditedRecord());
		}
		//ends here
		
		displayRecord(form.getLocalContext().getEditedRecord());
		form.btnEdit().setVisible(true);
		
		form.btnEdit().setVisible(form.getLocalContext().getEditedRecordIsNotNull() ? true : false);		
	}
	
	protected void onBtnBMIClick() throws PresentationLogicException 
	{
		if (form.decHeight().getValue() == null || form.decWeight().getValue() == null) 
		{
			engine.showMessage("Please enter both Height and Weight for Metrics", "Error calculate BMI", MessageButtons.OK);
			return;
		}
		else
		{
			if ((form.decHeight().getValue() == 0 || form.decHeight().getValue() < 1) ||
					(form.decWeight().getValue() == 0 || form.decWeight().getValue() < 0))
			{
				engine.showMessage("A non-zero and greather than 1 value needs to be specified for Height and Weight", "Error calculate BMI", MessageButtons.OK);
				return;
			}
		}
					
		form.decBMI().setValue(bodyMassIndex(form.decHeight().getValue().floatValue(), form.decWeight().getValue().floatValue()));		
	}
	
	//WDEV-7526 starts here
	@Override
	protected void onLnkTemperatureClick() throws PresentationLogicException 
	{
		engine.open(form.getForms().Core.VitalSignsTemperature);	
	}
	@Override
	protected void onLnkPainScoreClick() throws PresentationLogicException 
	{
	
		engine.open(form.getForms().Core.VitalSignsPainLadder);
	}
	@Override
	protected void onLnkCapillaryBloodGlucoseClick() throws PresentationLogicException 
	{
	
		engine.open(form.getForms().Core.VitalSignsBloodSugar);
	}
	@Override
	protected void onLnkMetricsClick() throws PresentationLogicException 
	{
	
		engine.open(form.getForms().Core.VitalSignsMetrics);
	}
	@Override
	protected void onLnkPeakFlowClick() throws PresentationLogicException 
	{
	
		engine.open(form.getForms().Core.VitalSignsPeakFlow);
	}
	@Override
	protected void onLnkOxygenSaturationClick() throws PresentationLogicException 
	{
	
		engine.open(form.getForms().Core.VitalSignsOxygenSaturation);
	}
	@Override
	protected void onLnkRespirationsClick() throws PresentationLogicException 
	{
	
		engine.open(form.getForms().Core.VitalSignsRespiration);
	}
	@Override
	protected void onLnkBloodPressureClick() throws PresentationLogicException 
	{
	
		engine.open(form.getForms().Core.VitalSignsBP);
	}
	@Override
	protected void onLnkPulseClick() throws PresentationLogicException 
	{
	
		engine.open(form.getForms().Core.VitalSignsPulse);
	}	
	// ends here
}
