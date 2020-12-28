package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Owner;

public interface OwnerCrudDAO {
	
	public int createOwner(Owner owner) throws BusinessException;
	public void deleteOwner(int ownerId) throws BusinessException;
	public int updateOwnerContact(int ownerId, String newPhone) throws BusinessException;
	public Owner getOwnerById(int ownerId) throws BusinessException;
	public List<Owner> getAllOwners() throws BusinessException;
	

}
