package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Studentdao {
	
	public void insertData(int id, String name, String city, String country) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		
		PreparedStatement ps = c.prepareStatement("insert into student values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setNString(3, city);
		ps.setNString(4, country);
		ps.executeUpdate();

		System.out.println("Record Inserted");
	}
	
	public void deleteData(int id) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");	
		PreparedStatement ps = c.prepareStatement("delete from student where sid=?");
		ps.setInt(1, id);
		ps.executeUpdate();

		System.out.println("Record Deleted");
		
	}
	
	public void updateData(int id, String name) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");	
		PreparedStatement ps = c.prepareStatement("update student set sname=? where sid=?");
		ps.setString(1,name);
		ps.setInt(2, id);
		ps.executeUpdate();

		System.out.println("Record updated");
	}
	
	public void fetchData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");	
		PreparedStatement ps = c.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
	}

}
