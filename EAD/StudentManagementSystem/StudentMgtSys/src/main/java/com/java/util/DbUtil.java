package com.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private static final String DRIVER_NAME= "com.mysql.cj.jdbc.Driver";
	private static final String DBNAME="studentmgmt";
	private static final String DBURL= "jdbc:mysql//localhost:4001/";
	private static final String USERNAME="root";
	private static final String PASSWORD="";
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_NAME);
		return DriverManager.getConnection(DBURL+DBNAME,USERNAME,PASSWORD);

	}
	
}
