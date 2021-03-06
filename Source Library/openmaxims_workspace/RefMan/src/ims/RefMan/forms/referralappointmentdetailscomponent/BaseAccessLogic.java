// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.referralappointmentdetailscomponent;

import java.io.Serializable;
import ims.framework.Context;
import ims.framework.FormName;
import ims.framework.FormAccessLogic;

public class BaseAccessLogic extends FormAccessLogic implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final void setContext(Context context, FormName formName)
	{
		form = new CurrentForm(new GlobalContext(context), new CurrentForms());
		engine = new CurrentEngine(formName);
	}
	public boolean isAccessible()
	{

		return true;
	}
	public boolean isReadOnly()
	{
		return false;
	}

	public CurrentEngine engine;
	public CurrentForm form;

	public final static class CurrentForm implements Serializable
	{
		private static final long serialVersionUID = 1L;

		CurrentForm(GlobalContext globalcontext, CurrentForms forms)
		{
			this.globalcontext = globalcontext;
			this.forms = forms;
		}
		public final GlobalContext getGlobalContext()
		{
			return globalcontext;
		}
		public final CurrentForms getForms()
		{
			return forms;
		}
		private GlobalContext globalcontext;
		private CurrentForms forms;
	}
	public final static class CurrentEngine implements Serializable
	{
		private static final long serialVersionUID = 1L;

		CurrentEngine(FormName formName)
		{
			this.formName = formName;
		}
		public final FormName getFormName()
		{
			return formName;
		}
		private FormName formName;
	}
	public static final class CurrentForms implements Serializable
	{
		private static final long serialVersionUID = 1L;

		protected final class LocalFormName extends FormName
		{
			private static final long serialVersionUID = 1L;
		
			protected LocalFormName(int value)
			{
				super(value);
			}
		}

		private CurrentForms()
		{
			Scheduling = new SchedulingForms();
			OCRR = new OCRRForms();
			RefMan = new RefManForms();
		}
		public final class SchedulingForms implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private SchedulingForms()
			{
				CancelAppointmentDialog = new LocalFormName(114160);
				AppointmentHistoryDialog = new LocalFormName(135103);
			}
			public final FormName CancelAppointmentDialog;
			public final FormName AppointmentHistoryDialog;
		}
		public final class OCRRForms implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private OCRRForms()
			{
				SelectAndOrderDialog = new LocalFormName(116131);
				ImportResultsDialog = new LocalFormName(116149);
				RejectedInvestigationDetails = new LocalFormName(116150);
				ResultDialog = new LocalFormName(116128);
				OrderSummaryDialog = new LocalFormName(116132);
			}
			public final FormName SelectAndOrderDialog;
			public final FormName ImportResultsDialog;
			public final FormName RejectedInvestigationDetails;
			public final FormName ResultDialog;
			public final FormName OrderSummaryDialog;
		}
		public final class RefManForms implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private RefManForms()
			{
				BookAppointmentDialog = new LocalFormName(134134);
				BookSpecimenAppointmentDialog = new LocalFormName(134139);
				EnterAppointmentDetails = new LocalFormName(134146);
				BookedAppointments = new LocalFormName(134113);
				BookTheatreDialog = new LocalFormName(134159);
				BookTheatreSlot = new LocalFormName(134208);
				ERODDialog = new LocalFormName(134216);
				CancelTCIForPatientElectiveListDialog = new LocalFormName(134227);
				RemoveFromElectiveList = new LocalFormName(134229);
				NewElectiveListTCIErodDialog = new LocalFormName(134224);
			}
			public final FormName BookAppointmentDialog;
			public final FormName BookSpecimenAppointmentDialog;
			public final FormName EnterAppointmentDetails;
			public final FormName BookedAppointments;
			public final FormName BookTheatreDialog;
			public final FormName BookTheatreSlot;
			public final FormName ERODDialog;
			public final FormName CancelTCIForPatientElectiveListDialog;
			public final FormName RemoveFromElectiveList;
			public final FormName NewElectiveListTCIErodDialog;
		}

		public SchedulingForms Scheduling;
		public OCRRForms OCRR;
		public RefManForms RefMan;
	}
}
