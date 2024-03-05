package com.tunhub.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class song implements Comparable<song>{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	String artist;
	String genre;
	String link;
	@ManyToMany
	List<playlist> p;
	@ManyToMany
	List<folder> f;
	public song() {
		super();
		// TODO Auto-generated constructor stub
	}
	public song(int id, String name, String artist, String genre, String link, List<playlist> p, List<folder> f) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.genre = genre;
		this.link = link;
		this.p = p;
		this.f = f;
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
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<playlist> getP() {
		return p;
	}
	public void setP(List<playlist> p) {
		this.p = p;
	}
	public List<folder> getF() {
		return f;
	}
	public void setF(List<folder> f) {
		this.f = f;
	}
	@Override
	public String toString() {
		return "song";
	}
	@Override
	public int compareTo(song o) {
		
		return this.name.compareToIgnoreCase(o.getName());
	}
	
	
	
	
	

}
