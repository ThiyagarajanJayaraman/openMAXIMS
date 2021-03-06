// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.selectpreviousdiagnoses;

import ims.framework.*;
import ims.framework.controls.*;
import ims.framework.enumerations.*;
import ims.framework.utils.RuntimeAnchoring;

public class GenForm extends FormBridge
{
	private static final long serialVersionUID = 1L;

	public boolean canProvideData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).canProvideData();
	}
	public boolean hasData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).hasData();
	}
	public IReportField[] getData(IReportSeed[] reportSeeds)
	{
		return getData(reportSeeds, false);
	}
	public IReportField[] getData(IReportSeed[] reportSeeds, boolean excludeNulls)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields(), excludeNulls).getData();
	}
	public static class grdDiagnosisRow extends GridRowBridge
	{
		private static final long serialVersionUID = 1L;
		
		protected grdDiagnosisRow(GridRow row)
		{
			super(row);
		}
		public void showOpened(int column)
		{
			super.row.showOpened(column);
		}
		public void setcolDescriptionReadOnly(boolean value)
		{
			super.row.setReadOnly(0, value);
		}
		public boolean iscolDescriptionReadOnly()
		{
			return super.row.isReadOnly(0);
		}
		public void showcolDescriptionOpened()
		{
			super.row.showOpened(0);
		}
		public void setTooltipForcolDescription(String value)
		{
			super.row.setTooltip(0, value);
		}
		public String getcolDescription()
		{
			return (String)super.row.get(0);
		}
		public void setcolDescription(String value)
		{
			super.row.set(0, value);
		}
		public void setCellcolDescriptionTooltip(String value)
		{
			super.row.setTooltip(0, value);
		}
		public void setcolDiagnosisDateReadOnly(boolean value)
		{
			super.row.setReadOnly(1, value);
		}
		public boolean iscolDiagnosisDateReadOnly()
		{
			return super.row.isReadOnly(1);
		}
		public void showcolDiagnosisDateOpened()
		{
			super.row.showOpened(1);
		}
		public void setTooltipForcolDiagnosisDate(String value)
		{
			super.row.setTooltip(1, value);
		}
		public String getcolDiagnosisDate()
		{
			return (String)super.row.get(1);
		}
		public void setcolDiagnosisDate(String value)
		{
			super.row.set(1, value);
		}
		public void setCellcolDiagnosisDateTooltip(String value)
		{
			super.row.setTooltip(1, value);
		}
		public void setcolStatusReadOnly(boolean value)
		{
			super.row.setReadOnly(2, value);
		}
		public boolean iscolStatusReadOnly()
		{
			return super.row.isReadOnly(2);
		}
		public void showcolStatusOpened()
		{
			super.row.showOpened(2);
		}
		public void setTooltipForcolStatus(String value)
		{
			super.row.setTooltip(2, value);
		}
		public String getcolStatus()
		{
			return (String)super.row.get(2);
		}
		public void setcolStatus(String value)
		{
			super.row.set(2, value);
		}
		public void setCellcolStatusTooltip(String value)
		{
			super.row.setTooltip(2, value);
		}
		public void setcolAuthoringHCPDateTimeReadOnly(boolean value)
		{
			super.row.setReadOnly(3, value);
		}
		public boolean iscolAuthoringHCPDateTimeReadOnly()
		{
			return super.row.isReadOnly(3);
		}
		public void showcolAuthoringHCPDateTimeOpened()
		{
			super.row.showOpened(3);
		}
		public void setTooltipForcolAuthoringHCPDateTime(String value)
		{
			super.row.setTooltip(3, value);
		}
		public String getcolAuthoringHCPDateTime()
		{
			return (String)super.row.get(3);
		}
		public void setcolAuthoringHCPDateTime(String value)
		{
			super.row.set(3, value);
		}
		public void setCellcolAuthoringHCPDateTimeTooltip(String value)
		{
			super.row.setTooltip(3, value);
		}
		public void setcolSelectReadOnly(boolean value)
		{
			super.row.setReadOnly(4, value);
		}
		public boolean iscolSelectReadOnly()
		{
			return super.row.isReadOnly(4);
		}
		public void showcolSelectOpened()
		{
			super.row.showOpened(4);
		}
		public void setTooltipForcolSelect(String value)
		{
			super.row.setTooltip(4, value);
		}
		public boolean getcolSelect()
		{
			return ((Boolean)super.row.get(4)).booleanValue();
		}
		public void setcolSelect(boolean value)
		{
			super.row.set(4, new Boolean(value));
		}
		public void setCellcolSelectTooltip(String value)
		{
			super.row.setTooltip(4, value);
		}
		public ims.core.vo.PatientDiagnosisListVo getValue()
		{
			return (ims.core.vo.PatientDiagnosisListVo)super.row.getValue();
		}
		public void setValue(ims.core.vo.PatientDiagnosisListVo value)
		{
			super.row.setValue(value);
		}
	}
	public static class grdDiagnosisRowCollection extends GridRowCollectionBridge
	{
		private static final long serialVersionUID = 1L;
		
		private grdDiagnosisRowCollection(GridRowCollection collection)
		{
			super(collection);
		}
		public grdDiagnosisRow get(int index)
		{
			return new grdDiagnosisRow(super.collection.get(index));
		}
		public grdDiagnosisRow newRow()
		{
			return new grdDiagnosisRow(super.collection.newRow());
		}
		public grdDiagnosisRow newRow(boolean autoSelect)
		{
			return new grdDiagnosisRow(super.collection.newRow(autoSelect));
		}
		public grdDiagnosisRow newRowAt(int index)
		{
			return new grdDiagnosisRow(super.collection.newRowAt(index));
		}
		public grdDiagnosisRow newRowAt(int index, boolean autoSelect)
		{
			return new grdDiagnosisRow(super.collection.newRowAt(index, autoSelect));
		}
	}
	public static class grdDiagnosisGrid extends GridBridge
	{
		private static final long serialVersionUID = 1L;
		
		private void addStringColumn(String caption, int captionAlignment, int alignment, int width, boolean readOnly, boolean bold, int sortOrder, int maxLength, boolean canGrow, ims.framework.enumerations.CharacterCasing casing)
		{
			super.grid.addStringColumn(caption, captionAlignment, alignment, width, readOnly, bold, sortOrder, maxLength, canGrow, casing);
		}
		private void addBoolColumn(String caption, int captionAlignment, int alignment, int width, boolean readOnly, boolean autoPostBack, int sortOrder, boolean canGrow)
		{
			super.grid.addBoolColumn(caption, captionAlignment, alignment, width, readOnly, autoPostBack, sortOrder, canGrow);
		}
		public ims.core.vo.PatientDiagnosisListVoCollection getValues()
		{
			ims.core.vo.PatientDiagnosisListVoCollection listOfValues = new ims.core.vo.PatientDiagnosisListVoCollection();
			for(int x = 0; x < this.getRows().size(); x++)
			{
				listOfValues.add(this.getRows().get(x).getValue());
			}
			return listOfValues;
		}
		public ims.core.vo.PatientDiagnosisListVo getValue()
		{
			return (ims.core.vo.PatientDiagnosisListVo)super.grid.getValue();
		}
		public void setValue(ims.core.vo.PatientDiagnosisListVo value)
		{
			super.grid.setValue(value);
		}
		public grdDiagnosisRow getSelectedRow()
		{
			return super.grid.getSelectedRow() == null ? null : new grdDiagnosisRow(super.grid.getSelectedRow());
		}
		public int getSelectedRowIndex()
		{
			return super.grid.getSelectedRowIndex();
		}
		public grdDiagnosisRowCollection getRows()
		{
			return new grdDiagnosisRowCollection(super.grid.getRows());
		}
		public grdDiagnosisRow getRowByValue(ims.core.vo.PatientDiagnosisListVo value)
		{
			GridRow row = super.grid.getRowByValue(value);
			return row == null?null:new grdDiagnosisRow(row);
		}
		public void setcolDescriptionHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(0, value);
		}
		public String getcolDescriptionHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(0);
		}
		public void setcolDiagnosisDateHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(1, value);
		}
		public String getcolDiagnosisDateHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(1);
		}
		public void setcolStatusHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(2, value);
		}
		public String getcolStatusHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(2);
		}
		public void setcolAuthoringHCPDateTimeHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(3, value);
		}
		public String getcolAuthoringHCPDateTimeHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(3);
		}
		public void setcolSelectHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(4, value);
		}
		public String getcolSelectHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(4);
		}
	}
	private void validateContext(ims.framework.Context context)
	{
		if(context == null)
			return;
	}
	public boolean supportsRecordedInError()
	{
		return false;
	}
	public ims.vo.ValueObject getRecordedInErrorVo()
	{
		return null;
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context) throws Exception
	{
		setContext(loader, form, appForm, factory, context, Boolean.FALSE, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context, Boolean skipContextValidation) throws Exception
	{
		setContext(loader, form, appForm, factory, context, skipContextValidation, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, ims.framework.Context context, Boolean skipContextValidation, Integer startControlID, ims.framework.utils.SizeInfo runtimeSize, ims.framework.Control control, Integer startTabIndex) throws Exception
	{
		if(loader == null); // this is to avoid eclipse warning only.
		if(factory == null); // this is to avoid eclipse warning only.
		if(runtimeSize == null); // this is to avoid eclipse warning only.
		if(appForm == null)
			throw new RuntimeException("Invalid application form");
		if(startControlID == null)
			throw new RuntimeException("Invalid startControlID");
		if(control == null); // this is to avoid eclipse warning only.
		if(startTabIndex == null)
			throw new RuntimeException("Invalid startTabIndex");
		this.context = context;
		this.componentIdentifier = startControlID.toString();
		this.formInfo = form.getFormInfo();
		this.globalContext = new GlobalContext(context);
	
		if(skipContextValidation == null || !skipContextValidation.booleanValue())
		{
			validateContext(context);
		}
	
		super.setContext(form);

		ims.framework.utils.SizeInfo designSize = new ims.framework.utils.SizeInfo(840, 304);
		if(runtimeSize == null)
			runtimeSize = designSize;
		form.setWidth(runtimeSize.getWidth());
		form.setHeight(runtimeSize.getHeight());
		super.setGlobalContext(ContextBridgeFlyweightFactory.getInstance().create(GlobalContextBridge.class, context, false));
		super.setLocalContext(new LocalContext(context, form.getFormInfo(), componentIdentifier));


		// Button Controls
		RuntimeAnchoring anchoringHelper1 = new RuntimeAnchoring(designSize, runtimeSize, 760, 272, 72, 24, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1000), new Integer(anchoringHelper1.getX()), new Integer(anchoringHelper1.getY()), new Integer(anchoringHelper1.getWidth()), new Integer(anchoringHelper1.getHeight()), new Integer(startTabIndex.intValue() + 3), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Cancel", Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper2 = new RuntimeAnchoring(designSize, runtimeSize, 680, 272, 72, 24, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1001), new Integer(anchoringHelper2.getX()), new Integer(anchoringHelper2.getY()), new Integer(anchoringHelper2.getWidth()), new Integer(anchoringHelper2.getHeight()), new Integer(startTabIndex.intValue() + 2), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Ok", Boolean.FALSE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));

		// Grid Controls
		RuntimeAnchoring anchoringHelper3 = new RuntimeAnchoring(designSize, runtimeSize, 8, 8, 824, 256, ims.framework.enumerations.ControlAnchoring.TOPLEFT);
		Grid m_grdDiagnosisTemp = (Grid)factory.getControl(Grid.class, new Object[] { control, new Integer(startControlID.intValue() + 1002), new Integer(anchoringHelper3.getX()), new Integer(anchoringHelper3.getY()), new Integer(anchoringHelper3.getWidth()), new Integer(anchoringHelper3.getHeight()), new Integer(startTabIndex.intValue() + 1), ControlState.READONLY, ControlState.EDITABLE, ims.framework.enumerations.ControlAnchoring.TOPLEFT,Boolean.FALSE, Boolean.FALSE, new Integer(24), Boolean.TRUE, null, Boolean.FALSE, Boolean.FALSE, new Integer(0), null, Boolean.FALSE, Boolean.TRUE});
		addControl(m_grdDiagnosisTemp);
		grdDiagnosisGrid grdDiagnosis = (grdDiagnosisGrid)GridFlyweightFactory.getInstance().createGridBridge(grdDiagnosisGrid.class, m_grdDiagnosisTemp);
		grdDiagnosis.addStringColumn("Diagnosis Description", 0, 0, 300, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdDiagnosis.addStringColumn("Diagnosis Date", 0, 0, 100, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdDiagnosis.addStringColumn("Status", 0, 0, 100, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdDiagnosis.addStringColumn("Authoring HCP / Date Time", 0, 0, 230, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdDiagnosis.addBoolColumn("Select", 1, 1, -1, false, true, 0, true);
		super.addGrid(grdDiagnosis);
	}


	public Button btnCancel()
	{
		return (Button)super.getControl(0);
	}
	public Button btnOk()
	{
		return (Button)super.getControl(1);
	}
	public grdDiagnosisGrid grdDiagnosis()
	{
		return (grdDiagnosisGrid)super.getGrid(0);
	}
	public GlobalContext getGlobalContext()
	{
		return this.globalContext;
	}
	public static class GlobalContextBridge extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
	}
	public LocalContext getLocalContext()
	{
		return (LocalContext)super.getLocalCtx();
	}
	public class LocalContext extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
		
		public LocalContext(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			super.setContext(context);
			String prefix = formInfo.getLocalVariablesPrefix();
			cxl_CurrentCareContext = new ims.framework.ContextVariable("CurrentCareContext", prefix + "_lv_RefMan.SelectPreviousDiagnoses.__internal_x_context__CurrentCareContext_" + componentIdentifier + "");
		}
		
		public boolean getCurrentCareContextIsNotNull()
		{
			return !cxl_CurrentCareContext.getValueIsNull(context);
		}
		public ims.core.vo.CareContextLiteVo getCurrentCareContext()
		{
			return (ims.core.vo.CareContextLiteVo)cxl_CurrentCareContext.getValue(context);
		}
		public void setCurrentCareContext(ims.core.vo.CareContextLiteVo value)
		{
			cxl_CurrentCareContext.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_CurrentCareContext = null;
	}
	private IReportField[] getFormReportFields()
	{
		if(this.context == null)
			return null;
		if(this.reportFields == null)
			this.reportFields = new ReportFields(this.context, this.formInfo, this.componentIdentifier).getReportFields();
		return this.reportFields;
	}
	private class ReportFields
	{
		public ReportFields(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			this.context = context;
			this.formInfo = formInfo;
			this.componentIdentifier = componentIdentifier;
		}
		public IReportField[] getReportFields()
		{
			String prefix = formInfo.getLocalVariablesPrefix();
			IReportField[] fields = new IReportField[75];
			fields[0] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ID", "ID_Patient");
			fields[1] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SEX", "Sex");
			fields[2] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOB", "Dob");
			fields[3] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOD", "Dod");
			fields[4] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-RELIGION", "Religion");
			fields[5] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISACTIVE", "IsActive");
			fields[6] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ETHNICORIGIN", "EthnicOrigin");
			fields[7] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-MARITALSTATUS", "MaritalStatus");
			fields[8] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SCN", "SCN");
			fields[9] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SOURCEOFINFORMATION", "SourceOfInformation");
			fields[10] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-TIMEOFDEATH", "TimeOfDeath");
			fields[11] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISQUICKREGISTRATIONPATIENT", "IsQuickRegistrationPatient");
			fields[12] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-CURRENTRESPONSIBLECONSULTANT", "CurrentResponsibleConsultant");
			fields[13] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-ID", "ID_Patient");
			fields[14] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-SEX", "Sex");
			fields[15] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-DOB", "Dob");
			fields[16] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ID", "ID_ClinicalContact");
			fields[17] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-SPECIALTY", "Specialty");
			fields[18] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CONTACTTYPE", "ContactType");
			fields[19] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-STARTDATETIME", "StartDateTime");
			fields[20] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ENDDATETIME", "EndDateTime");
			fields[21] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CARECONTEXT", "CareContext");
			fields[22] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ISCLINICALNOTECREATED", "IsClinicalNoteCreated");
			fields[23] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ID", "ID_Hcp");
			fields[24] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-HCPTYPE", "HcpType");
			fields[25] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISACTIVE", "IsActive");
			fields[26] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISHCPARESPONSIBLEHCP", "IsHCPaResponsibleHCP");
			fields[27] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISARESPONSIBLEEDCLINICIAN", "IsAResponsibleEDClinician");
			fields[28] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ID", "ID_CareContext");
			fields[29] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-CONTEXT", "Context");
			fields[30] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ORDERINGHOSPITAL", "OrderingHospital");
			fields[31] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ESTIMATEDDISCHARGEDATE", "EstimatedDischargeDate");
			fields[32] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-STARTDATETIME", "StartDateTime");
			fields[33] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ENDDATETIME", "EndDateTime");
			fields[34] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-LOCATIONTYPE", "LocationType");
			fields[35] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-RESPONSIBLEHCP", "ResponsibleHCP");
			fields[36] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ID", "ID_EpisodeOfCare");
			fields[37] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-CARESPELL", "CareSpell");
			fields[38] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-SPECIALTY", "Specialty");
			fields[39] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-RELATIONSHIP", "Relationship");
			fields[40] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-STARTDATE", "StartDate");
			fields[41] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ENDDATE", "EndDate");
			fields[42] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[43] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALNOTE", "ClinicalNote");
			fields[44] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTETYPE", "NoteType");
			fields[45] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-DISCIPLINE", "Discipline");
			fields[46] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALCONTACT", "ClinicalContact");
			fields[47] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISDERIVEDNOTE", "IsDerivedNote");
			fields[48] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEW", "ForReview");
			fields[49] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[50] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-REVIEWINGDATETIME", "ReviewingDateTime");
			fields[51] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISCORRECTED", "IsCorrected");
			fields[52] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISTRANSCRIBED", "IsTranscribed");
			fields[53] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-SOURCEOFNOTE", "SourceOfNote");
			fields[54] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-RECORDINGDATETIME", "RecordingDateTime");
			fields[55] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-INHOSPITALREPORT", "InHospitalReport");
			fields[56] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[57] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[58] = new ims.framework.ReportField(this.context, "_cvp_STHK.AvailableBedsListFilter", "BO-1014100009-ID", "ID_BedSpaceState");
			fields[59] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ID", "ID_PendingEmergencyAdmission");
			fields[60] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ADMISSIONSTATUS", "AdmissionStatus");
			fields[61] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ID", "ID_InpatientEpisode");
			fields[62] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ESTDISCHARGEDATE", "EstDischargeDate");
			fields[63] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[64] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEW", "ForReview");
			fields[65] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[66] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[67] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[68] = new ims.framework.ReportField(this.context, "_cvp_Core.PasEvent", "BO-1014100003-ID", "ID_PASEvent");
			fields[69] = new ims.framework.ReportField(this.context, "_cvp_Correspondence.CorrespondenceDetails", "BO-1052100001-ID", "ID_CorrespondenceDetails");
			fields[70] = new ims.framework.ReportField(this.context, "_cvp_RefMan.CatsReferral", "BO-1004100035-ID", "ID_CatsReferral");
			fields[71] = new ims.framework.ReportField(this.context, prefix + "_lv_RefMan.SelectPreviousDiagnoses.__internal_x_context__CurrentCareContext_" + componentIdentifier, "BO-1004100019-ID", "ID_CareContext");
			fields[72] = new ims.framework.ReportField(this.context, prefix + "_lv_RefMan.SelectPreviousDiagnoses.__internal_x_context__CurrentCareContext_" + componentIdentifier, "BO-1004100019-CONTEXT", "Context");
			fields[73] = new ims.framework.ReportField(this.context, prefix + "_lv_RefMan.SelectPreviousDiagnoses.__internal_x_context__CurrentCareContext_" + componentIdentifier, "BO-1004100019-ORDERINGHOSPITAL", "OrderingHospital");
			fields[74] = new ims.framework.ReportField(this.context, prefix + "_lv_RefMan.SelectPreviousDiagnoses.__internal_x_context__CurrentCareContext_" + componentIdentifier, "BO-1004100019-ESTIMATEDDISCHARGEDATE", "EstimatedDischargeDate");
			return fields;
		}
		protected Context context = null;
		protected ims.framework.FormInfo formInfo;
		protected String componentIdentifier;
	}
	public String getUniqueIdentifier()
	{
		return null;
	}
	private Context context = null;
	private ims.framework.FormInfo formInfo = null;
	private String componentIdentifier;
	private GlobalContext globalContext = null;
	private IReportField[] reportFields = null;
}
