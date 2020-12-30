package com.app.main;


import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.app.exception.BusinessException;
import com.app.model.Owner;
import com.app.service.OwnerSearchService;
import com.app.service.impl.OwnerSearchServiceImpl;

public class OwnerSearchMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Owner Search app V1.0");
		System.out.println("--------------------------------");
		int ch = 0;
		OwnerSearchService ownerSearchService = new OwnerSearchServiceImpl();
		do {
			System.out.println("Owner Search Menu");
			System.out.println("==================");
			System.out.println("1) By Owner ID");
			System.out.println("2) By Contact Number");
			System.out.println("3) By Age");
			System.out.println("4) By Gender");
			System.out.println("5) By Dog ID");
			System.out.println("6) By Date of Birth");
			System.out.println("7) By Owner name");
			System.out.println("8) Show All Owners");
			System.out.println("9) Exit");
			System.out.println("Enter an option between 1 and 9: ");
			try {
			ch = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				
			}
			switch(ch) {
			case 1: 
				System.out.println("Please enter the Owner ID: ");
				try {
					int ownerId = Integer.parseInt(sc.nextLine());
					Owner owner = ownerSearchService.getOwnerById(ownerId); //call service layer object now that it has done a handshake with DAO layer
					if(owner != null) {
						System.out.println("Owner with ID: " + ownerId + " has the following details: ");
						System.out.println(owner);
					}
					}catch(NumberFormatException e) {
						System.out.println("Owner ID is a numeric value. Please try again.");
					} catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
				break;
			case 2: 
				System.out.println("Please enter the contact number of the Owner ");
				String ownerPhone = sc.nextLine();
				try {
					Owner owner = ownerSearchService.getOwnerByContact(ownerPhone);
					if(owner != null) {
						System.out.println("Owner with the contact number " + ownerPhone + " has the following details: ");
						System.out.println(owner);
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
					System.out.println("Please try the format 000-000-0000");
				}				
				break;
			case 3: 
				try {
					System.out.println("Please enter an age: ");
					int ownerAge = Integer.parseInt(sc.nextLine());
					List<Owner> ageOwnersList = ownerSearchService.getOwnersByAge(ownerAge);
					if(ageOwnersList != null && ageOwnersList.size() > 0) {
						System.out.println("There are " + ageOwnersList.size() + " Owners that are " + ownerAge + " years old. Here are the details: ");
						for(Owner o : ageOwnersList) {
							System.out.println(o);
						}
					}
				} catch(NumberFormatException e) {
					System.out.println("Age is a numeric value. Please try again.");
				}
				catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4: 
				try {
					System.out.println("Please enter the gender of the Owner: ");
					String ownerGender = sc.nextLine();
					List<Owner> genderOwnersList = ownerSearchService.getOwnersByGender(ownerGender);
					if(genderOwnersList != null && genderOwnersList.size() > 0) {
						System.out.println("There are " + genderOwnersList.size() + " Owners that are of the" + ownerGender + " gender. Here are the details: ");
						for(Owner o : genderOwnersList) {
							System.out.println(o);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
					System.out.println("Try 'F' for Female \n--'M' for Male \n--'O' for Other");
				}
				break;
			case 5: 
				System.out.println("Enter Dog ID to find the respective Owners: ");
				try {
					int dogId = Integer.parseInt(sc.nextLine());
					List<Owner> dogOwnersList = ownerSearchService.getOwnersByDogId(dogId);
					if(dogOwnersList != null && dogOwnersList.size() > 0) {
						System.out.println("There are " + dogOwnersList.size() + " Owners that own this dog breed. Here are the details: ");
						for(Owner o : dogOwnersList) {
							System.out.println(o);
						}
					}
				} catch(NumberFormatException e) {
					System.out.println("Dog ID is a numeric value. Please try again");
				}
				catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6: 
				System.out.println("Please enter a birthdate: ");
				try {
					Date ownerDob = Date.valueOf(sc.nextLine());
					List<Owner> dobOwnersList;
					dobOwnersList = ownerSearchService.getOwnersByDob(ownerDob);//Validation layer occurs here
					if(dobOwnersList != null && dobOwnersList.size() > 0) {
						System.out.println("There are " + dobOwnersList.size() + " Owners with this birthdate. Here are the details: ");
						for(Owner o : dobOwnersList) {
							System.out.println(o);
						}
					}} catch(IllegalArgumentException e) {
						System.out.println("Try using the format 'yyyy-[m]m-[d]d' again");
					}catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
					
				break;
			case 7: 
				System.out.println("Please enter a First and Last name: ");
				
				try {
					String ownerName = sc.nextLine();
					List<Owner> nameOwnersList;
					nameOwnersList = ownerSearchService.getOwnersByName(ownerName);
					if(nameOwnersList != null && nameOwnersList.size() > 0) {
						System.out.println("There are " + nameOwnersList.size() + " Owners with this name. Here are the details: ");
						for(Owner o : nameOwnersList) {
							System.out.println(o);
						}
					}
				} catch (BusinessException e) { //Only one catch because scanner returns a String by default
					System.out.println("Try 'First Name' 'Last Name'");
					System.out.println(e.getMessage());
				}
				break;
			case 8: 
				System.out.println("Retrieving all of the Owners: ");
				try {
					List<Owner> allOwnersList = ownerSearchService.getAllOwners();
					if(allOwnersList != null && allOwnersList.size() > 0) {
						System.out.println("There are " + allOwnersList.size() + " Owners. Here are the details: ");
						for(Owner o : allOwnersList) {
							System.out.println(o);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 9: 
				System.out.println("Thank you for using our Owner Search App, have a nice day");
				break;
			default:
				System.out.println("Invalid option, please retry");
				break;
			}
		}while(ch != 9);
	}

} //Task Complete Options 2, 4, 6, 7
