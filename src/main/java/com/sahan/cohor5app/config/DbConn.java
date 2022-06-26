package com.sahan.cohor5app.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DbConn {
	
//	private static final String DB_URL = "jdbc:mysql://localhost:3306/mobiledb";
//	private static final String DB_USER = "root";
//	private static final String DB_PASS = "root";
	
	
	//mysql://bf59dd30734bd2:eda4bd21@us-cdbr-east-05.cleardb.net/heroku_a3576b257bcb90a?reconnect=true
	
	private static final String DB_URL = "jdbc:mysql://us-cdbr-east-05.cleardb.net/heroku_a3576b257bcb90a";
	private static final String DB_USER = "bf59dd30734bd2";
	private static final String DB_PASS = "eda4bd21";
	
	public static Connection getConnection() {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			return conn;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
