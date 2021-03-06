// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to RefMan.CatsReferral business object (ID: 1004100035).
 */
public class CatsReferralFlaggedForReviewVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<CatsReferralFlaggedForReviewVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<CatsReferralFlaggedForReviewVo> col = new ArrayList<CatsReferralFlaggedForReviewVo>();
	public String getBoClassName()
	{
		return "ims.RefMan.domain.objects.CatsReferral";
	}
	public boolean add(CatsReferralFlaggedForReviewVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, CatsReferralFlaggedForReviewVo value)
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
	public int indexOf(CatsReferralFlaggedForReviewVo instance)
	{
		return col.indexOf(instance);
	}
	public CatsReferralFlaggedForReviewVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, CatsReferralFlaggedForReviewVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(CatsReferralFlaggedForReviewVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(CatsReferralFlaggedForReviewVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		CatsReferralFlaggedForReviewVoCollection clone = new CatsReferralFlaggedForReviewVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((CatsReferralFlaggedForReviewVo)this.col.get(x).clone());
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
	public CatsReferralFlaggedForReviewVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public CatsReferralFlaggedForReviewVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public CatsReferralFlaggedForReviewVoCollection sort(SortOrder order)
	{
		return sort(new CatsReferralFlaggedForReviewVoComparator(order));
	}
	public CatsReferralFlaggedForReviewVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new CatsReferralFlaggedForReviewVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public CatsReferralFlaggedForReviewVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.RefMan.vo.CatsReferralRefVoCollection toRefVoCollection()
	{
		ims.RefMan.vo.CatsReferralRefVoCollection result = new ims.RefMan.vo.CatsReferralRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public CatsReferralFlaggedForReviewVo[] toArray()
	{
		CatsReferralFlaggedForReviewVo[] arr = new CatsReferralFlaggedForReviewVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<CatsReferralFlaggedForReviewVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class CatsReferralFlaggedForReviewVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public CatsReferralFlaggedForReviewVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public CatsReferralFlaggedForReviewVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public CatsReferralFlaggedForReviewVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			CatsReferralFlaggedForReviewVo voObj1 = (CatsReferralFlaggedForReviewVo)obj1;
			CatsReferralFlaggedForReviewVo voObj2 = (CatsReferralFlaggedForReviewVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.RefMan.vo.beans.CatsReferralFlaggedForReviewVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.RefMan.vo.beans.CatsReferralFlaggedForReviewVoBean[] getBeanCollectionArray()
	{
		ims.RefMan.vo.beans.CatsReferralFlaggedForReviewVoBean[] result = new ims.RefMan.vo.beans.CatsReferralFlaggedForReviewVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			CatsReferralFlaggedForReviewVo vo = ((CatsReferralFlaggedForReviewVo)col.get(i));
			result[i] = (ims.RefMan.vo.beans.CatsReferralFlaggedForReviewVoBean)vo.getBean();
		}
		return result;
	}
	public static CatsReferralFlaggedForReviewVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		CatsReferralFlaggedForReviewVoCollection coll = new CatsReferralFlaggedForReviewVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.RefMan.vo.beans.CatsReferralFlaggedForReviewVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static CatsReferralFlaggedForReviewVoCollection buildFromBeanCollection(ims.RefMan.vo.beans.CatsReferralFlaggedForReviewVoBean[] beans)
	{
		CatsReferralFlaggedForReviewVoCollection coll = new CatsReferralFlaggedForReviewVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
