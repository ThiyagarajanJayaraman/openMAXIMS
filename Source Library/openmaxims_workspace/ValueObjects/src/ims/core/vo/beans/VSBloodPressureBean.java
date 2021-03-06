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

public class VSBloodPressureBean extends ims.vo.ValueObjectBean
{
	public VSBloodPressureBean()
	{
	}
	public VSBloodPressureBean(ims.core.vo.VSBloodPressure vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.bpsittingsys = vo.getBPSittingSys();
		this.bpsittingdias = vo.getBPSittingDias();
		this.bpstandingsys = vo.getBPStandingSys();
		this.bpstandingdias = vo.getBPStandingDias();
		this.timeinterval = vo.getTimeInterval();
		this.bplyingsys = vo.getBPLyingSys();
		this.bplyingdias = vo.getBPLyingDias();
		this.comment = vo.getComment();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.VSBloodPressure vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.bpsittingsys = vo.getBPSittingSys();
		this.bpsittingdias = vo.getBPSittingDias();
		this.bpstandingsys = vo.getBPStandingSys();
		this.bpstandingdias = vo.getBPStandingDias();
		this.timeinterval = vo.getTimeInterval();
		this.bplyingsys = vo.getBPLyingSys();
		this.bplyingdias = vo.getBPLyingDias();
		this.comment = vo.getComment();
	}

	public ims.core.vo.VSBloodPressure buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.VSBloodPressure buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.VSBloodPressure vo = null;
		if(map != null)
			vo = (ims.core.vo.VSBloodPressure)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.VSBloodPressure();
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
	public Float getBPSittingSys()
	{
		return this.bpsittingsys;
	}
	public void setBPSittingSys(Float value)
	{
		this.bpsittingsys = value;
	}
	public Float getBPSittingDias()
	{
		return this.bpsittingdias;
	}
	public void setBPSittingDias(Float value)
	{
		this.bpsittingdias = value;
	}
	public Float getBPStandingSys()
	{
		return this.bpstandingsys;
	}
	public void setBPStandingSys(Float value)
	{
		this.bpstandingsys = value;
	}
	public Float getBPStandingDias()
	{
		return this.bpstandingdias;
	}
	public void setBPStandingDias(Float value)
	{
		this.bpstandingdias = value;
	}
	public Integer getTimeInterval()
	{
		return this.timeinterval;
	}
	public void setTimeInterval(Integer value)
	{
		this.timeinterval = value;
	}
	public Float getBPLyingSys()
	{
		return this.bplyingsys;
	}
	public void setBPLyingSys(Float value)
	{
		this.bplyingsys = value;
	}
	public Float getBPLyingDias()
	{
		return this.bplyingdias;
	}
	public void setBPLyingDias(Float value)
	{
		this.bplyingdias = value;
	}
	public String getComment()
	{
		return this.comment;
	}
	public void setComment(String value)
	{
		this.comment = value;
	}

	private Integer id;
	private int version;
	private Float bpsittingsys;
	private Float bpsittingdias;
	private Float bpstandingsys;
	private Float bpstandingdias;
	private Integer timeinterval;
	private Float bplyingsys;
	private Float bplyingdias;
	private String comment;
}
