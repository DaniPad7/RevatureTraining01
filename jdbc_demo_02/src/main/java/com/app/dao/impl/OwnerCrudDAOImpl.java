package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.OwnerCrudDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Owner;

public class OwnerCrudDAOImpl implements OwnerCrudDAO{

	@Override
	public int createOwner(Owner owner) throws BusinessException {
		int c= 0;
		try (Connection connection = PostgresqlConnection.getConnection()){
			String sql = "INSERT into test01.dog_owner(owner_id, owner_name, owner_gender, owner_address, owner_email, owner_phone, dog_id, product_id) values(?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, owner.getOwnerId());
			preparedStatement.setString(2, owner.getOwnerName());
			preparedStatement.setString(3, owner.getOwnerGender());
			preparedStatement.setString(4, owner.getOwnerAddress());
			preparedStatement.setString(5, owner.getOwnerEmail());
			preparedStatement.setString(6, owner.getOwnerPhone());
			preparedStatement.setInt(7, owner.getDogId());
			preparedStatement.setInt(8, owner.getProductId());
			
			c = preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return c;
	}

	@Override
	public void deleteOwner(int ownerId) throws BusinessException {
		// Task
				//String sql = "DELETE FROM test01.dog_owner WHERE id = ? "
		try (Connection connection = PostgresqlConnection.getConnection()){ //connect to database
			String sql = "DELETE FROM test01.dog_owner WHERE owner_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, ownerId);
			preparedStatement.executeUpdate();
			System.out.println("Owner deleted successfully");
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("An internal error occured contact SYSADMIN");
		}
	}

	@Override
	public int updateOwnerContact(int ownerId, String newPhone) throws BusinessException {
		// Task
		//String sql = "UPDATE test01.dog_owner SET owner_phone = ? WHERE owner_id = ? "
		int c = 0; //create local variable
		try(Connection connection = PostgresqlConnection.getConnection()) {
			String sql = "UPDATE test01.dog_owner SET owner_phone = ? WHERE owner_id = ?"; //we have two ? so insert two set methods
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, newPhone);
			preparedStatement.setInt(2, ownerId);
			c = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("An internal error occured contact SYSADMIN");
		}
		return c;
	}

	@Override
	public Owner getOwnerById(int ownerId) throws BusinessException {
		Owner owner = null;
		try (Connection connection = PostgresqlConnection.getConnection()) {
			String sql = "SELECT owner_name, owner_gender, owner_address, owner_email, owner_phone, dog_id, product_id FROM test01.dog_owner WHERE owner_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, ownerId);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				owner = new Owner();
				owner.setOwnerId(ownerId);
				owner.setOwnerName(resultSet.getString("owner_name"));
				owner.setOwnerGender(resultSet.getString("owner_gender"));
				owner.setOwnerAddress(resultSet.getString("owner_address"));
				owner.setOwnerEmail(resultSet.getString("owner_email"));
				owner.setOwnerPhone(resultSet.getString("owner_phone"));
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
	public List<Owner> getAllOwners() throws BusinessException {
		List<Owner> ownersList= new ArrayList<>();
		try (Connection connection = PostgresqlConnection.getConnection()) {
			String sql = "SELECT owner_id, owner_name, owner_gender, owner_address, owner_email, owner_phone, dog_id, product_id FROM test01.dog_owner";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Owner owner = new Owner();
				owner.setOwnerId(resultSet.getInt("owner_id"));
				owner.setOwnerName(resultSet.getString("owner_name"));
				owner.setOwnerGender(resultSet.getString("owner_gender"));;
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
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		
		
		return ownersList;
	}

}
