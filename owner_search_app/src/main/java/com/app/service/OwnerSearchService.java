package com.app.service;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Owner;

public interface OwnerSearchService {
	public Owner getOwnerById(int ownerId) throws BusinessException;
	public Owner getOwnerByContact(String ownerPhone) throws BusinessException;
	public List<Owner> getAllOwners() throws BusinessException;
	public List<Owner> getOwnersByAge(int ownerAge) throws BusinessException; //new column
	public List<Owner> getOwnersByGender(String ownerGender) throws BusinessException;
	public List<Owner> getOwnersByDogId(int dogId) throws BusinessException; //changed for my database
	public List<Owner> getOwnersByName(String ownerName) throws BusinessException;
	public List<Owner> getOwnerByDob(String ownerDob) throws BusinessException; //new column

}
