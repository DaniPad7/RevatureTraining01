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

public class OwnerSearchDAOImpl implements OwnerSearchDAO {

	@Override
	public Owner getOwnerById(int ownerId) throws BusinessException {
		Owner owner = null;
		try (Connection connection = PostgresqlConnection.getConnection()) {
			String sql = "SELECT owner_name, owner_gender, owner_age, owner_address, owner_email, owner_phone, owner_dob, dog_id, product_id FROM test01.dog_owner WHERE owner_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, ownerId);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				owner = new Owner();
				owner.setOwnerId(ownerId);
				owner.setOwnerName(resultSet.getString("owner_name"));
				owner.setOwnerAge(resultSet.getInt("owner_age"));
				owner.setOwnerGender(resultSet.getString("owner_gender"));
				owner.setOwnerAddress(resultSet.getString("owner_address"));
				owner.setOwnerEmail(resultSet.getString("owner_email"));
				owner.setOwnerPhone(resultSet.getString("owner_phone"));
				owner.setOwnerDob(resultSet.getDate("owner_dob"));
				owner.setDogId(resultSet.getInt("dog_id"));
				owner.setProductId(resultSet.getInt("product_id"));
			}
			else {
				throw new BusinessException("No owner with id: " + ownerId);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
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
		List<Owner> ownersList= new ArrayList<>();
		try (Connection connection = PostgresqlConnection.getConnection()) {
			String sql = "SELECT owner_id, owner_name, owner_age, owner_gender, owner_address, owner_email, owner_phone, owner_dob, dog_id, product_id FROM test01.dog_owner";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Owner owner = new Owner();
				owner.setOwnerId(resultSet.getInt("owner_id"));
				owner.setOwnerName(resultSet.getString("owner_name"));
				owner.setOwnerAge(resultSet.getInt("owner_age"));
				owner.setOwnerGender(resultSet.getString("owner_gender"));;
				owner.setOwnerAddress(resultSet.getString("owner_address"));
				owner.setOwnerEmail(resultSet.getString("owner_email"));
				owner.setOwnerPhone(resultSet.getString("owner_phone"));
				owner.setOwnerDob(resultSet.getDate("owner_dob"));
				owner.setDogId(resultSet.getInt("dog_id"));
				owner.setProductId(resultSet.getInt("product_id"));
				ownersList.add(owner);
			}
			if(ownersList.size() == 0) {
				throw new BusinessException("No owners in the DB so far");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		
		
		return ownersList;
	}

	@Override
	public List<Owner> getOwnersByAge(int ownerAge) throws BusinessException {
		List<Owner> ownersList= new ArrayList<>();
		try (Connection connection = PostgresqlConnection.getConnection()) {
			String sql = "SELECT owner_id, owner_name, owner_age, owner_gender, owner_address, owner_email, owner_phone, owner_dob, dog_id, product_id FROM test01.dog_owner WHERE owner_age = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, ownerAge);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Owner owner = new Owner();
				owner.setOwnerId(resultSet.getInt("owner_id"));
				owner.setOwnerName(resultSet.getString("owner_name"));
				owner.setOwnerAge(resultSet.getInt("owner_age"));
				owner.setOwnerGender(resultSet.getString("owner_gender"));;
				owner.setOwnerAddress(resultSet.getString("owner_address"));
				owner.setOwnerEmail(resultSet.getString("owner_email"));
				owner.setOwnerPhone(resultSet.getString("owner_phone"));
				owner.setOwnerDob(resultSet.getDate("owner_dob"));
				owner.setDogId(resultSet.getInt("dog_id"));
				owner.setProductId(resultSet.getInt("product_id"));
				ownersList.add(owner);
			}
			if(ownersList.size() == 0) {
				throw new BusinessException("No owners found with the age: " + ownerAge);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		
		
		return ownersList;
	}

	@Override
	public List<Owner> getOwnersByGender(String ownerGender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Owner> getOwnersByDogId(int dogId) throws BusinessException {
		List<Owner> ownersList= new ArrayList<>();
		try (Connection connection = PostgresqlConnection.getConnection()) {
			String sql = "SELECT owner_id, owner_name, owner_age, owner_gender, owner_address, owner_email, owner_phone, owner_dob, dog_id, product_id FROM test01.dog_owner WHERE dog_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, dogId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Owner owner = new Owner();
				owner.setOwnerId(resultSet.getInt("owner_id"));
				owner.setOwnerName(resultSet.getString("owner_name"));
				owner.setOwnerAge(resultSet.getInt("owner_age"));
				owner.setOwnerGender(resultSet.getString("owner_gender"));;
				owner.setOwnerAddress(resultSet.getString("owner_address"));
				owner.setOwnerEmail(resultSet.getString("owner_email"));
				owner.setOwnerPhone(resultSet.getString("owner_phone"));
				owner.setOwnerDob(resultSet.getDate("owner_dob"));
				owner.setDogId(resultSet.getInt("dog_id"));
				owner.setProductId(resultSet.getInt("product_id"));
				ownersList.add(owner);
			}
			if(ownersList.size() == 0) {
				throw new BusinessException("No owners found with the dog ID: " + dogId);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		
		
		return ownersList;
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
