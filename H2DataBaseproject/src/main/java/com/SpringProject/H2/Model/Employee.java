package com.SpringProject.H2.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table
public class Employee {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int phoneNo;
	@Column
	private String mailID;
	@Column
	private int salary;
	@Column
	private String BaseLocation;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getPhoneNo() {
//		return phoneNo;
//	}
//	public void setPhoneNo(int phoneNo) {
//		this.phoneNo = phoneNo;
//	}
//	public String getMailID() {
//		return mailID;
//	}
//	public void setMailID(String mailID) {
//		this.mailID = mailID;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//	public String getBaseLocation() {
//		return BaseLocation;
//	}
//	public void setBaseLocation(String baseLocation) {
//		BaseLocation = baseLocation;
//	}

}
