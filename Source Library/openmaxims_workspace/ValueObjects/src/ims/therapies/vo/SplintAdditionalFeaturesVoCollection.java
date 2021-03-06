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

package ims.therapies.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to therapies.treatment.SplintsAdditionalFeatures business object (ID: 1019100039).
 */
public class SplintAdditionalFeaturesVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<SplintAdditionalFeaturesVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<SplintAdditionalFeaturesVo> col = new ArrayList<SplintAdditionalFeaturesVo>();
	public String getBoClassName()
	{
		return "ims.therapies.treatment.domain.objects.SplintsAdditionalFeatures";
	}
	public boolean add(SplintAdditionalFeaturesVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, SplintAdditionalFeaturesVo value)
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
	public int indexOf(SplintAdditionalFeaturesVo instance)
	{
		return col.indexOf(instance);
	}
	public SplintAdditionalFeaturesVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, SplintAdditionalFeaturesVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(SplintAdditionalFeaturesVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(SplintAdditionalFeaturesVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		SplintAdditionalFeaturesVoCollection clone = new SplintAdditionalFeaturesVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((SplintAdditionalFeaturesVo)this.col.get(x).clone());
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
	public SplintAdditionalFeaturesVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public SplintAdditionalFeaturesVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public SplintAdditionalFeaturesVoCollection sort(SortOrder order)
	{
		return sort(new SplintAdditionalFeaturesVoComparator(order));
	}
	public SplintAdditionalFeaturesVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new SplintAdditionalFeaturesVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public SplintAdditionalFeaturesVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.therapies.treatment.vo.SplintsAdditionalFeaturesRefVoCollection toRefVoCollection()
	{
		ims.therapies.treatment.vo.SplintsAdditionalFeaturesRefVoCollection result = new ims.therapies.treatment.vo.SplintsAdditionalFeaturesRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public SplintAdditionalFeaturesVo[] toArray()
	{
		SplintAdditionalFeaturesVo[] arr = new SplintAdditionalFeaturesVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<SplintAdditionalFeaturesVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class SplintAdditionalFeaturesVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public SplintAdditionalFeaturesVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public SplintAdditionalFeaturesVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public SplintAdditionalFeaturesVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			SplintAdditionalFeaturesVo voObj1 = (SplintAdditionalFeaturesVo)obj1;
			SplintAdditionalFeaturesVo voObj2 = (SplintAdditionalFeaturesVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.therapies.vo.beans.SplintAdditionalFeaturesVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.therapies.vo.beans.SplintAdditionalFeaturesVoBean[] getBeanCollectionArray()
	{
		ims.therapies.vo.beans.SplintAdditionalFeaturesVoBean[] result = new ims.therapies.vo.beans.SplintAdditionalFeaturesVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			SplintAdditionalFeaturesVo vo = ((SplintAdditionalFeaturesVo)col.get(i));
			result[i] = (ims.therapies.vo.beans.SplintAdditionalFeaturesVoBean)vo.getBean();
		}
		return result;
	}
	public static SplintAdditionalFeaturesVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		SplintAdditionalFeaturesVoCollection coll = new SplintAdditionalFeaturesVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.therapies.vo.beans.SplintAdditionalFeaturesVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static SplintAdditionalFeaturesVoCollection buildFromBeanCollection(ims.therapies.vo.beans.SplintAdditionalFeaturesVoBean[] beans)
	{
		SplintAdditionalFeaturesVoCollection coll = new SplintAdditionalFeaturesVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
