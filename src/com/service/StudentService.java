package com.service;

import com.dao.Studentdao;

public class StudentService {
	
	public void insertdata(int id, String name, String city, String country) throws Exception{
		Studentdao sd=new Studentdao();
		sd.insertData(id,name,city,country);
	}
	public void updateData(int id, String name) throws Exception{
		Studentdao sd=new Studentdao();
		sd.updateData(id,name);
	}
	public void deleteData(int id) throws Exception{
		Studentdao sd=new Studentdao();
		sd.deleteData(id);
	}
	public void fetchData() throws Exception{
		Studentdao sd=new Studentdao();
		sd.fetchData();
	}
}
