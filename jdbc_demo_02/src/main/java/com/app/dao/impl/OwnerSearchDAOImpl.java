package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.OwnerSearchDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Owner;

public class OwnerSearchDAOImpl implements OwnerSearchDAO{

	@Override
	public Owner getOwnerByContact(String ownerPhone) throws BusinessException {
		Owner owner = null;// create local object
		try (Connection connection = PostgresqlConnection.getConnection()){ //now establish connection with database
			String sql = "SELECT * FROM test01.dog_owner WHERE owner_phone = ?"; //now write sql query to achieve function
			PreparedStatement preparedStatement  = connection.prepareStatement(sql); //connect the sql query
			preparedStatement.setString(1, ownerPhone); //Connect owner_phone column with parameter
			ResultSet resultSet = preparedStatement.executeQuery(); //move query into object resultSet
			if(resultSet.next()) {
				owner = new Owner(); //move fields into new owner object
				owner.setOwnerId(resultSet.getInt("owner_id"));
				owner.setOwnerName(resultSet.getString("owner_name"));
				owner.setOwnerGender(resultSet.getString("owner_gender"));
				owner.setOwnerAddress(resultSet.getString("owner_address"));
				owner.setOwnerEmail(resultSet.getString("owner_email"));
				owner.setOwnerPhone(resultSet.getString("owner_phone"));
				owner.setDogId(resultSet.getInt("dog_id"));
				owner.setProductId(resultSet.getInt("product_id"));
			}
			else {
				throw new BusinessException("There is no owner with phone " + ownerPhone);	//exception messages go here	
				}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			System.out.println("Internal error occured contact SYSADMIN");
		}
		return owner;
	}

	@Override
	public List<Owner> getOwnersByGender(String ownerGender) throws BusinessException { //Added gender column
		List<Owner> ownersList = new ArrayList<>(); //create local object
		try(Connection connection = PostgresqlConnection.getConnection()) {
			String sql = "SELECT * FROM test01.dog_owner WHERE owner_gender = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, ownerGender); //this is included when there is a parameter
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Owner owner = new Owner();
				owner.setOwnerId(resultSet.getInt("owner_id"));
				owner.setOwnerName(resultSet.getString("owner_name"));
				owner.setOwnerGender(resultSet.getString("owner_gender"));
				owner.setOwnerAddress(resultSet.getString("owner_address"));
				owner.setOwnerEmail(resultSet.getString("owner_email"));
				owner.setOwnerPhone(resultSet.getString("owner_phone"));
				owner.setDogId(resultSet.getInt("dog_id"));
				owner.setProductId(resultSet.getInt("product_id"));
				ownersList.add(owner);
			}
			if(ownersList.size() == 0) {
				throw new BusinessException("No owners in the DB so far");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			System.out.println("An internal error occured contact SYSADMIN");
		}
		return ownersList;
	}

}
