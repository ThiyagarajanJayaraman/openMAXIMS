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

package ims.nursing.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to nursing.care plans.Care Plan Intervention business object (ID: 1010100005).
 */
public class CarePlanInterventionsCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<CarePlanInterventions>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<CarePlanInterventions> col = new ArrayList<CarePlanInterventions>();
	public String getBoClassName()
	{
		return "ims.nursing.careplans.domain.objects.CarePlanIntervention";
	}
	public boolean add(CarePlanInterventions value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, CarePlanInterventions value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(CarePlanInterventions instance)
	{
		return col.indexOf(instance);
	}
	public CarePlanInterventions get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, CarePlanInterventions value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(CarePlanInterventions instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(CarePlanInterventions instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		CarePlanInterventionsCollection clone = new CarePlanInterventionsCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((CarePlanInterventions)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public CarePlanInterventionsCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public CarePlanInterventionsCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public CarePlanInterventionsCollection sort(SortOrder order)
	{
		return sort(new CarePlanInterventionsComparator(order));
	}
	public CarePlanInterventionsCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new CarePlanInterventionsComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public CarePlanInterventionsCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.nursing.careplans.vo.CarePlanInterventionRefVoCollection toRefVoCollection()
	{
		ims.nursing.careplans.vo.CarePlanInterventionRefVoCollection result = new ims.nursing.careplans.vo.CarePlanInterventionRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public CarePlanInterventions[] toArray()
	{
		CarePlanInterventions[] arr = new CarePlanInterventions[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<CarePlanInterventions> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class CarePlanInterventionsComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public CarePlanInterventionsComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public CarePlanInterventionsComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public CarePlanInterventionsComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			CarePlanInterventions voObj1 = (CarePlanInterventions)obj1;
			CarePlanInterventions voObj2 = (CarePlanInterventions)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.nursing.vo.beans.CarePlanInterventionsBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.nursing.vo.beans.CarePlanInterventionsBean[] getBeanCollectionArray()
	{
		ims.nursing.vo.beans.CarePlanInterventionsBean[] result = new ims.nursing.vo.beans.CarePlanInterventionsBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			CarePlanInterventions vo = ((CarePlanInterventions)col.get(i));
			result[i] = (ims.nursing.vo.beans.CarePlanInterventionsBean)vo.getBean();
		}
		return result;
	}
	public static CarePlanInterventionsCollection buildFromBeanCollection(java.util.Collection beans)
	{
		CarePlanInterventionsCollection coll = new CarePlanInterventionsCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.nursing.vo.beans.CarePlanInterventionsBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static CarePlanInterventionsCollection buildFromBeanCollection(ims.nursing.vo.beans.CarePlanInterventionsBean[] beans)
	{
		CarePlanInterventionsCollection coll = new CarePlanInterventionsCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
