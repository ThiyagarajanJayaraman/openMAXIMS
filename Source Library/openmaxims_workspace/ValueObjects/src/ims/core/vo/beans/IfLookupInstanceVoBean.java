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

package ims.core.vo.beans;

public class IfLookupInstanceVoBean extends ims.vo.ValueObjectBean
{
	public IfLookupInstanceVoBean()
	{
	}
	public IfLookupInstanceVoBean(ims.core.vo.IfLookupInstanceVo vo)
	{
		this.verb = vo.getVerb();
		this.instancename = vo.getInstanceName();
		this.code = vo.getCode();
		this.system = vo.getSystem();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.IfLookupInstanceVo vo)
	{
		this.verb = vo.getVerb();
		this.instancename = vo.getInstanceName();
		this.code = vo.getCode();
		this.system = vo.getSystem();
	}

	public ims.core.vo.IfLookupInstanceVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.IfLookupInstanceVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.IfLookupInstanceVo vo = null;
		if(map != null)
			vo = (ims.core.vo.IfLookupInstanceVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.IfLookupInstanceVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public String getVerb()
	{
		return this.verb;
	}
	public void setVerb(String value)
	{
		this.verb = value;
	}
	public String getInstanceName()
	{
		return this.instancename;
	}
	public void setInstanceName(String value)
	{
		this.instancename = value;
	}
	public String getCode()
	{
		return this.code;
	}
	public void setCode(String value)
	{
		this.code = value;
	}
	public String getSystem()
	{
		return this.system;
	}
	public void setSystem(String value)
	{
		this.system = value;
	}

	private String verb;
	private String instancename;
	private String code;
	private String system;
}
