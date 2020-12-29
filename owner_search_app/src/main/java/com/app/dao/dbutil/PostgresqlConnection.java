package com.app.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresqlConnection {
	public static Connection connection;
	
	private PostgresqlConnection() {
		
	}
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver loaded successfully");
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "Heix#394";
		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}

}
