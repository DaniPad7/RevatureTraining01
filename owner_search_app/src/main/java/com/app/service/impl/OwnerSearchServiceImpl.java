package com.app.service.impl;

import java.util.List;

import com.app.dao.OwnerSearchDAO;
import com.app.dao.impl.OwnerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Owner;
import com.app.service.OwnerSearchService;

public class OwnerSearchServiceImpl implements OwnerSearchService {

	private OwnerSearchDAO ownerSearchDAO = new OwnerSearchDAOImpl();
	@Override
	public Owner getOwnerById(int ownerId) throws BusinessException {
		Owner owner = null;
		if(ownerId > 0) {
			owner = ownerSearchDAO.getOwnerById(ownerId);		}
		else {
			throw new BusinessException("The ID " + ownerId + " is invalid");
		}
		return owner;
	}

	@Override
	public Owner getOwnerByContact(String ownerPhone) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Owner> getAllOwners() throws BusinessException {
		List<Owner> allOwnersList = null;
		allOwnersList = ownerSearchDAO.getAllOwners();
		return allOwnersList;
	}

	@Override
	public List<Owner> getOwnersByAge(int ownerAge) throws BusinessException {
		List<Owner> ageOwnersList = null;
		if(ownerAge > 0 && ownerAge < 120) {
			ageOwnersList = ownerSearchDAO.getOwnersByAge(ownerAge);		}
		else {
			throw new BusinessException("The age " + ownerAge + " is invalid");
		}
		return ageOwnersList;
	}

	@Override
	public List<Owner> getOwnersByGender(String ownerGender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Owner> getOwnersByDogId(int dogId) throws BusinessException {
		List<Owner> dogOwnersList = null;
		if(dogId > 0 && dogId <= 12) {
			dogOwnersList = ownerSearchDAO.getOwnersByDogId(dogId);		}
		else {
			throw new BusinessException("The dog ID " + dogId + " is invalid");
		}
		return dogOwnersList;
	}

	@Override
	public List<Owner> getOwnersByName(String ownerName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Owner> getOwnerByDob(String ownerDob) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
