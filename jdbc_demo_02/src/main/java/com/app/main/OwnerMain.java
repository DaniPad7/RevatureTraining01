package com.app.main;

import java.util.List;

import com.app.dao.OwnerCrudDAO;
import com.app.dao.OwnerSearchDAO;
import com.app.dao.impl.OwnerCrudDAOImpl;
import com.app.dao.impl.OwnerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Owner;

public class OwnerMain {

	public static void main(String[] args) {


		OwnerCrudDAO dao = new OwnerCrudDAOImpl();
		OwnerSearchDAO owsdao = new OwnerSearchDAOImpl(); //instantiate each new dao
		
		/*Owner ow = new Owner(40, "Henry Gold", "M", "Mango Driveway", "due98@dfhid.com" , "934-354-7832", 11, 125);
		
		try {
			if(dao.createOwner(ow) != 0) {
				System.out.println("Owner created successfully");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
*/
		
		//Tasks for OwnerCrudDAOImpl
		/*try {
			dao.deleteOwner(40);
		} catch (BusinessException e) {
			System.out.println(e.getMessage()); //owner deleted
		} */
		
		try {
			if (dao.updateOwnerContact(20, "394-563-6732") != 0) {
				System.out.println("Contact updated successfully");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		/*try {
			Owner owner = dao.getOwnerById(40);
			if(owner != null) {
				System.out.println("Details of owner with id " + owner.getOwnerId());
				System.out.println(owner);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			List<Owner> ownersList = dao.getAllOwners();
			if(ownersList !=  null && ownersList.size() != 0 ) {
				System.out.println("\n\nFound " + ownersList.size() + " no. of owners... Printing them all");
				for(Owner o : ownersList) {
					System.out.println(o);
				}
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}*/
	
	
		
		
		
		
		
		
		/*
		
		 
		 
		 //Tasks for OwnerSearchDAOImpl
		try {
			
			List<Owner> ownersList = owsdao.getOwnersByGender("M");
			
			if(ownersList !=  null && ownersList.size() != 0) {
				System.out.println("\n\nFound " + ownersList.size() + " no. of owners... Prinitng them all" );
				for(Owner o : ownersList) {
					System.out.println(o);
				}
			}
			
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}*/
	
	
	/*try {
		Owner owner = owsdao.getOwnerByContact("647-578-5684");
		if(owner != null) {
			System.out.println("Details of owner with contact " + owner.getOwnerPhone());
			System.out.println(owner);
		}
	} catch (BusinessException e) {
		System.out.println(e.getMessage());
	} */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
