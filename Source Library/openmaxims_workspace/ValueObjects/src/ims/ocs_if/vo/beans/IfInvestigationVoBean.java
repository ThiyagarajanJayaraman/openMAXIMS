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

package ims.ocs_if.vo.beans;

public class IfInvestigationVoBean extends ims.vo.ValueObjectBean
{
	public IfInvestigationVoBean()
	{
	}
	public IfInvestigationVoBean(ims.ocs_if.vo.IfInvestigationVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.providerservice = vo.getProviderService() == null ? null : (ims.ocs_if.vo.beans.IfLocSvcProviderSysVoBean)vo.getProviderService().getBean();
		this.providerinvcode = vo.getProviderInvCode();
		this.activestatus = vo.getActiveStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getActiveStatus().getBean();
		this.separateorder = vo.getSeparateOrder();
		this.investigationindex = vo.getInvestigationIndex() == null ? null : (ims.ocs_if.vo.beans.IfInvestigationIndexVoBean)vo.getInvestigationIndex().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocs_if.vo.IfInvestigationVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.providerservice = vo.getProviderService() == null ? null : (ims.ocs_if.vo.beans.IfLocSvcProviderSysVoBean)vo.getProviderService().getBean(map);
		this.providerinvcode = vo.getProviderInvCode();
		this.activestatus = vo.getActiveStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getActiveStatus().getBean();
		this.separateorder = vo.getSeparateOrder();
		this.investigationindex = vo.getInvestigationIndex() == null ? null : (ims.ocs_if.vo.beans.IfInvestigationIndexVoBean)vo.getInvestigationIndex().getBean(map);
	}

	public ims.ocs_if.vo.IfInvestigationVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.ocs_if.vo.IfInvestigationVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocs_if.vo.IfInvestigationVo vo = null;
		if(map != null)
			vo = (ims.ocs_if.vo.IfInvestigationVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.ocs_if.vo.IfInvestigationVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.ocs_if.vo.beans.IfLocSvcProviderSysVoBean getProviderService()
	{
		return this.providerservice;
	}
	public void setProviderService(ims.ocs_if.vo.beans.IfLocSvcProviderSysVoBean value)
	{
		this.providerservice = value;
	}
	public String getProviderInvCode()
	{
		return this.providerinvcode;
	}
	public void setProviderInvCode(String value)
	{
		this.providerinvcode = value;
	}
	public ims.vo.LookupInstanceBean getActiveStatus()
	{
		return this.activestatus;
	}
	public void setActiveStatus(ims.vo.LookupInstanceBean value)
	{
		this.activestatus = value;
	}
	public Boolean getSeparateOrder()
	{
		return this.separateorder;
	}
	public void setSeparateOrder(Boolean value)
	{
		this.separateorder = value;
	}
	public ims.ocs_if.vo.beans.IfInvestigationIndexVoBean getInvestigationIndex()
	{
		return this.investigationindex;
	}
	public void setInvestigationIndex(ims.ocs_if.vo.beans.IfInvestigationIndexVoBean value)
	{
		this.investigationindex = value;
	}

	private Integer id;
	private int version;
	private ims.ocs_if.vo.beans.IfLocSvcProviderSysVoBean providerservice;
	private String providerinvcode;
	private ims.vo.LookupInstanceBean activestatus;
	private Boolean separateorder;
	private ims.ocs_if.vo.beans.IfInvestigationIndexVoBean investigationindex;
}
