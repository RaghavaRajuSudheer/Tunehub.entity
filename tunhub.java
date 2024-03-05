package com.tunhub.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class tunhub {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String username;
	String email;
	String password;
	String gender;
	String role;
	String address;
	boolean prime;
	@ManyToMany
	List<playlist> p;
	public tunhub() {
		super();
		// TODO Auto-generated constructor stub
	}
	public tunhub(int id, String username, String email, String password, String gender, String role, String address,
			boolean prime, List<playlist> p) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.role = role;
		this.address = address;
		this.prime = prime;
		this.p = p;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isPrime() {
		return prime;
	}
	public void setPrime(boolean prime) {
		this.prime = prime;
	}
	public List<playlist> getP() {
		return p;
	}
	public void setP(List<playlist> p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "tunhub [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", role=" + role + ", address=" + address + ", prime=" + prime + ", p=" + p
				+ "]";
	}
	
	
	

}
