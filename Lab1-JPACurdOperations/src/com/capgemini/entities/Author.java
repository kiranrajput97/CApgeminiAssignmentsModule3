package com.capgemini.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Author")   //If you want to mention any different table name then use this @Table.
public class Author implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id    
	private int authorId;   //@Id make primary key 
	private String authorFirstName;
	private String authorLastName;
	private String authorPhoneNumber;
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorFirstName() {
		return authorFirstName;
	}
	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}
	public String getAuthorLastName() {
		return authorLastName;
	}
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	public String getAuthorPhoneNumber() {
		return authorPhoneNumber;
	}
	public void setAuthorPhoneNumber(String authorPhoneNumber) {
		this.authorPhoneNumber = authorPhoneNumber;
	}
	
	@Override
	public String toString()
	{
		return "ID :"+authorId+"\n"+"authorFirstName :"+authorFirstName+"\n"+"authorLastName :"+authorLastName+"\n";
		
	}
	


}
