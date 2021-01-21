package com.prabhubank.model;

public class Employee {
	private Long eid;
	private String firstName;
	private String lastName;
	private String role;
	
	public Employee(Long eid, String firstName, String lastName, String role) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}
	
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role + "]";
	}

}
