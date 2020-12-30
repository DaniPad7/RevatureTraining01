package com.app.service.impl;


import java.sql.Date;
import java.text.DateFormat;
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
		Owner owner = null;
		if(ownerPhone.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
			owner = ownerSearchDAO.getOwnerByContact(ownerPhone);		} //service layer calls DAO layer
		else {
			throw new BusinessException("The contact number " + ownerPhone + " is invalid");
		}
		return owner;
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
		List<Owner> genderOwnersList = null;
		if(ownerGender.matches("F|M|O")) {
			genderOwnersList = ownerSearchDAO.getOwnersByGender(ownerGender);		}
		else {
			throw new BusinessException("The gender " + ownerGender + " is invalid");
		}
		return genderOwnersList;
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
		List<Owner> nameOwnersList = null; //Instantiate default for a return method first
		if(ownerName.matches("^[\\p{L} .'-]+$")) { //then consider loops for validating inputs that are in the correct data type & found in Stackoverflow
			nameOwnersList = ownerSearchDAO.getOwnersByName(ownerName);		}
		else {
			throw new BusinessException("The name " + ownerName + " is invalid");
		}
		return nameOwnersList;
	}

	@Override
	public List<Owner> getOwnersByDob(Date ownerDob) throws BusinessException {
		List<Owner> dobOwnersList = null;
		//DateFormat dFormat = DateFormat.getDateInstance();//Attempt to make the Date lenient to calendar
		if(ownerDob != null) {
			dobOwnersList = ownerSearchDAO.getOwnersByDob(ownerDob);		}
		else {
			throw new BusinessException("The Birthdate " + ownerDob + " is invalid");
		}
		return dobOwnersList;
	}

}
