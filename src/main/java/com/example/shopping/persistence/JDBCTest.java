package com.example.shopping.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTest {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void testConnection() {

		try (Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "spring", "1234"
				)) {
			System.out.println(con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
