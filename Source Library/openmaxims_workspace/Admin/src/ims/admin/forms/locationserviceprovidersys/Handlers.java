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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.admin.forms.locationserviceprovidersys;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode, ims.framework.interfaces.IClearInfo
{
	abstract protected void bindcmbCategoryLookup();
	abstract protected void defaultcmbCategoryLookupValue();
	abstract protected void bindcmbIdTypeLookup();
	abstract protected void defaultcmbIdTypeLookupValue();
	abstract protected void bindcmbCodeTypeLookup();
	abstract protected void defaultcmbCodeTypeLookupValue();
	abstract protected void onFormModeChanged();
	abstract protected void onFormClosing(CancelArgs args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onTreHeaderTreeViewSelectionChanged(ims.framework.controls.TreeNode node) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbCategoryValueSet(Object value);
	abstract protected void oncmbIdTypeValueSet(Object value);
	abstract protected void oncmbCodeTypeValueSet(Object value);
	abstract protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormModeChangedEvent(new FormModeChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle()
			{
				onFormModeChanged();
			}
		});
		this.form.setFormClosingEvent(new FormClosing()
		{
			private static final long serialVersionUID = 1L;
			public void handle(CancelArgs args) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormClosing(args);
			}
		});
		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				bindLookups();
				onFormOpen();
			}
		});
		this.form.setFormDialogClosedEvent(new FormDialogClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormDialogClosed(formName, result);
			}
		});
		this.form.btnSave().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveClick();
			}
		});
		this.form.btnCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelClick();
			}
		});
		this.form.treHeader().setTreeViewSelectionChangedEvent(new TreeViewSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.TreeNode node) throws ims.framework.exceptions.PresentationLogicException
			{
				onTreHeaderTreeViewSelectionChanged(node);
			}
		});
		this.form.cmbCategory().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbCategoryValueSet(value);
			}
		});
		this.form.cmbIdType().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbIdTypeValueSet(value);
			}
		});
		this.form.cmbCodeType().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbCodeTypeValueSet(value);
			}
		});
		this.form.getContextMenus().getGenericGridAddItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.Add, sender);
			}
		});
		this.form.getContextMenus().getGenericGridUpdateItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.Update, sender);
			}
		});
		this.form.getContextMenus().getGenericGridRemoveItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.Remove, sender);
			}
		});
		this.form.getContextMenus().getGenericGridViewItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.View, sender);
			}
		});
		this.form.getContextMenus().getGenericGridMoveUpItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.MoveUp, sender);
			}
		});
		this.form.getContextMenus().getGenericGridMoveDownItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.MoveDown, sender);
			}
		});
		this.form.getContextMenus().getGenericGridReplaceItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.Replace, sender);
			}
		});
		this.form.getContextMenus().getGenericGridConfirmItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.Confirm, sender);
			}
		});
		this.form.getContextMenus().getGenericGridEDIT_VIEW_ICP_ACTIONSItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.GenericGrid.EDIT_VIEW_ICP_ACTIONS, sender);
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbCategoryLookup();
		bindcmbIdTypeLookup();
		bindcmbCodeTypeLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbCategoryLookup();
		bindcmbIdTypeLookup();
		bindcmbCodeTypeLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbCategoryLookupValue();
		defaultcmbIdTypeLookupValue();
		defaultcmbCodeTypeLookupValue();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	public abstract void clearContextInformation();
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}
