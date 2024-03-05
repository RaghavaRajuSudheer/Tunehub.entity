package com.tunhub.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class folder {
	@Id
	String name;
	String artist;
	String genre;
	@ManyToMany
	List<song> link;
	public folder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public folder(String name, String artist, String genre, List<song> link) {
		super();
		this.name = name;
		this.artist = artist;
		this.genre = genre;
		this.link = link;
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
	public List<song> getLink() {
		return link;
	}
	public void setLink(List<song> link) {
		this.link = link;
	}
	@Override
	public String toString() {
		return "folder [name=" + name + ", artist=" + artist + ", genre=" + genre + ", link=" + link + "]";
	}
	
	
	
	

}
