package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Owner;

public interface OwnerSearchDAO {
	
	public Owner getOwnerByContact(String ownerPhone) throws BusinessException;
	public List<Owner> getOwnersByGender(String ownerGender) throws BusinessException;

}
