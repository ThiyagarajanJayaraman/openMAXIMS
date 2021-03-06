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

package ims.clinical.vo.beans;

public class PIDBarOncologyManualVoBean extends ims.vo.ValueObjectBean
{
	public PIDBarOncologyManualVoBean()
	{
	}
	public PIDBarOncologyManualVoBean(ims.clinical.vo.PIDBarOncologyManualVo vo)
	{
		this.diagnosisid = vo.getDiagnosisId();
		this.diagnosisdesc = vo.getDiagnosisDesc();
		this.startdate = vo.getStartDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getStartDate().getBean();
		this.enddate = vo.getEndDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getEndDate().getBean();
		this.hcpname = vo.getHCPName();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.PIDBarOncologyManualVo vo)
	{
		this.diagnosisid = vo.getDiagnosisId();
		this.diagnosisdesc = vo.getDiagnosisDesc();
		this.startdate = vo.getStartDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getStartDate().getBean();
		this.enddate = vo.getEndDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getEndDate().getBean();
		this.hcpname = vo.getHCPName();
	}

	public ims.clinical.vo.PIDBarOncologyManualVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.PIDBarOncologyManualVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.PIDBarOncologyManualVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.PIDBarOncologyManualVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.PIDBarOncologyManualVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getDiagnosisId()
	{
		return this.diagnosisid;
	}
	public void setDiagnosisId(Integer value)
	{
		this.diagnosisid = value;
	}
	public String getDiagnosisDesc()
	{
		return this.diagnosisdesc;
	}
	public void setDiagnosisDesc(String value)
	{
		this.diagnosisdesc = value;
	}
	public ims.framework.utils.beans.DateBean getStartDate()
	{
		return this.startdate;
	}
	public void setStartDate(ims.framework.utils.beans.DateBean value)
	{
		this.startdate = value;
	}
	public ims.framework.utils.beans.DateBean getEndDate()
	{
		return this.enddate;
	}
	public void setEndDate(ims.framework.utils.beans.DateBean value)
	{
		this.enddate = value;
	}
	public String getHCPName()
	{
		return this.hcpname;
	}
	public void setHCPName(String value)
	{
		this.hcpname = value;
	}

	private Integer diagnosisid;
	private String diagnosisdesc;
	private ims.framework.utils.beans.DateBean startdate;
	private ims.framework.utils.beans.DateBean enddate;
	private String hcpname;
}
