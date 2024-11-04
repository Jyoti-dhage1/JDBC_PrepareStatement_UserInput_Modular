package com.entity;

public class Student {
	
	 private int sid; 
	 private String sname;
	 private String city;
	 private String country;
	 
	 	 
	 public Student() {
		 
	 }
	 
	public Student(int sid, String sname, String city, String country) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.country = country;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + ", country=" + country + "]";
	}

	

}
