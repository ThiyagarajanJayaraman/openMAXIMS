// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.65 build 3218.18820)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.RefMan.domain.impl;

import ims.RefMan.domain.base.impl.BaseReferralReviewDetailsImpl;
import ims.RefMan.domain.objects.CatsReferral;
import ims.RefMan.vo.CatsReferralRefVo;
import ims.RefMan.vo.CatsReferralReviewDetailVo;
import ims.RefMan.vo.domain.CatsReferralReviewDetailVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;

public class ReferralReviewDetailsImpl extends BaseReferralReviewDetailsImpl
{
	private static final long serialVersionUID = 1L;
	
	public CatsReferralReviewDetailVo saveReferral(CatsReferralReviewDetailVo vo) throws StaleObjectException
	{
		if(vo == null)
			throw new DomainRuntimeException("CatsReferralVo is null");
		if (vo != null && !vo.isValidated())
			throw new DomainRuntimeException("CatsReferralVo is not validated");
		
		DomainFactory factory = getDomainFactory();
		CatsReferral doCats = CatsReferralReviewDetailVoAssembler.extractCatsReferral(factory, vo);
		factory.save(doCats);
		return CatsReferralReviewDetailVoAssembler.create(doCats);
	}
	
	public CatsReferralReviewDetailVo getCatsReferral(CatsReferralRefVo voRef) 
	{
		if(voRef == null)
			throw new DomainRuntimeException("Cannot get CatsReferralVo for null CatsReferralRefVo");	
		
		return CatsReferralReviewDetailVoAssembler.create((CatsReferral)getDomainFactory().getDomainObject(CatsReferral.class, voRef.getID_CatsReferral()));
	}

}
