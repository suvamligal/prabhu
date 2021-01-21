package com.prabhubank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue
	private int cid;
	private String username;
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String contactNumber;
	private String role;

	public Customer() {
		
	}

	public Customer(int cid, String username, String firstName, String lastName, String city, String state,
			String contactNumber, String role) {
		super();
		this.cid = cid;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.contactNumber = contactNumber;
		this.role = role;
	}


	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", city=" + city + ", state=" + state + ", contactNumber=" + contactNumber + ", role=" + role + "]";
	}
		

}
