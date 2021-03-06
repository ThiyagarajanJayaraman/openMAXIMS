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

package ims.admin.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class RuleConditionType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public RuleConditionType()
	{
		super();
	}
	public RuleConditionType(int id)
	{
		super(id, "", true);
	}
	public RuleConditionType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public RuleConditionType(int id, String text, boolean active, RuleConditionType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public RuleConditionType(int id, String text, boolean active, RuleConditionType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public RuleConditionType(int id, String text, boolean active, RuleConditionType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static RuleConditionType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new RuleConditionType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (RuleConditionType)super.getParentInstance();
	}
	public RuleConditionType getParent()
	{
		return (RuleConditionType)super.getParentInstance();
	}
	public void setParent(RuleConditionType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		RuleConditionType[] typedChildren = new RuleConditionType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (RuleConditionType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof RuleConditionType)
		{
			super.addChild((RuleConditionType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof RuleConditionType)
		{
			super.removeChild((RuleConditionType)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		RuleConditionTypeCollection result = new RuleConditionTypeCollection();
		result.add(LOGICAL);
		result.add(VALUE);
		result.add(FIRST_LOGICAL);
		return result;
	}
	public static RuleConditionType[] getNegativeInstances()
	{
		RuleConditionType[] instances = new RuleConditionType[3];
		instances[0] = LOGICAL;
		instances[1] = VALUE;
		instances[2] = FIRST_LOGICAL;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "LOGICAL";
		negativeInstances[1] = "VALUE";
		negativeInstances[2] = "FIRST_LOGICAL";
		return negativeInstances;
	}
	public static RuleConditionType getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static RuleConditionType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		RuleConditionType[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1031016;
	public static final RuleConditionType LOGICAL = new RuleConditionType(-1741, "Logical", true, null, null, Color.Default);
	public static final RuleConditionType VALUE = new RuleConditionType(-1742, "Value", true, null, null, Color.Default);
	public static final RuleConditionType FIRST_LOGICAL = new RuleConditionType(-1764, "First Logical", true, null, null, Color.Default);
}
