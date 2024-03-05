package com.tunhub.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Table(name="playlist")
@Entity
public class playlist {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	@ManyToMany
	List<song> s;
	public playlist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public playlist(int id, String name, List<song> s) {
		super();
		this.id = id;
		this.name = name;
		this.s = s;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<song> getS() {
		return s;
	}
	public void setS(List<song> s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "playlist";
	}
	

}
