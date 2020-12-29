package com.app.model;

import java.sql.Date;

public class Owner {
	private int ownerId;
	private String ownerName;
	private int ownerAge;
	private String ownerGender;
	private String ownerAddress;
	private String ownerEmail;
	private String ownerPhone;
	private Date ownerDob;
	private int dogId;
	private int productId;
	
	public Owner() {
		super();
	}
	



	public Owner(int ownerId, String ownerName, int ownerAge, String ownerGender, String ownerAddress, String ownerEmail, String ownerPhone, Date ownerDob, int dogId,
			int productId) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.ownerAge = ownerAge;
		this.ownerAddress = ownerAddress;
		this.ownerEmail = ownerEmail;
		this.ownerPhone = ownerPhone;
		this.ownerDob = ownerDob;
		this.dogId = dogId;
		this.productId = productId;
	}



	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	public int getOwnerAge() {
		return ownerAge;
	}




	public void setOwnerAge(int ownerAge) {
		this.ownerAge = ownerAge;
	}




	public String getOwnerGender() {
		return ownerGender;
	}




	public void setOwnerGender(String ownerGender) {
		this.ownerGender = ownerGender;
	}




	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}



	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}



	public String getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}
	

	public Date getOwnerDob() {
		return ownerDob;
	}




	public void setOwnerDob(Date ownerDob) {
		this.ownerDob = ownerDob;
	}




	public int getDogId() {
		return dogId;
	}

	public void setDogId(int dogId) {
		this.dogId = dogId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Owner [owner_id=" + ownerId + ", owner_name=" + ownerName + ", owner_age=" + ownerAge + ", owner_gender=" + ownerGender + ",  owner_address=" + ownerAddress
				+ ", owner_phone=" + ownerPhone + ", owner_dob=" + ownerDob + ", dog_id=" + dogId + ", product_id=" + productId + "]";
	}
	

}
