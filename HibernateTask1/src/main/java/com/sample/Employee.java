package com.sample;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	public Employee(String ename, double esal, int eId) {
		super();
		this.ename = ename;
		this.esal = esal;
		this.eId = eId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String ename;
	private double esal;
	@Id
	private int eId;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	

	
	}
