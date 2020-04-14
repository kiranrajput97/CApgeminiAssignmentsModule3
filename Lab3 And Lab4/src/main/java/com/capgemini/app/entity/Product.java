package com.capgemini.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ProductData")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_seq")
	@SequenceGenerator(sequenceName = "pk_seq", allocationSize = 1, name = "pk_seq")
	private int productid;
	private String productName;
	
	private String productDescription;
	private Double productcost;
	public int getId() {
		return productid;
	}
	public void setId(int id) {
		this.productid = id;
	}
	public String getBookName() {
		return productName;
	}
	public void setBookName(String bookName) {
		this.productName = bookName;
		
	}
	public Double getCost() {
		return productcost;
	}
	public void setCost(Double cost) {
		this.productcost = cost;
	}
	public String getAuthor() {
		return productDescription;
	}
	public void setAuthor(String author) {
		this.productDescription = author;
	}
}
