package com.employee.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	int eid;
	String ename;
	String elocation;
	String eemail;
	String edob;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getElocation() {
		return elocation;
	}
	public void setElocation(String elocation) {
		this.elocation = elocation;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEdob() {
		return edob;
	}
	public void setEdob(String edob) {
		this.edob = edob;
	}
	public Employee(int eid, String ename, String elocation, String eemail, String edob) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.elocation = elocation;
		this.eemail = eemail;
		this.edob = edob;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
