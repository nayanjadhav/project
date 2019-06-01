package com.comptes.multidb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesJDBC {

	
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5434/db1", "postgres", "");
			//System.out.println(con.isClosed());
			PreparedStatement res = con.prepareStatement("select * from tes1.tab1");
			ResultSet r = res.executeQuery();
			r.next();
			String rr = r.getString(1);
			System.out.println(rr);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
