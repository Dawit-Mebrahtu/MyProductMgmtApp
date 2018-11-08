package edu.mum.cs.cs425.prodmgmt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long pid;
	private long productNumber;
	private String name;
	private float unitPrice;
	private Date dateMfd;
	
	public Product() {
		
	}
	public Product(long productNumber, String name, float unitPrice, Date dateMfd) {
		this.productNumber = productNumber;
		this.name = name;
		this.unitPrice = unitPrice;
		this.dateMfd = dateMfd;
	}
	public long getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(long productNumber) {
		this.productNumber = productNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Date getDateMfd() {
		return dateMfd;
	}
	public void setDateMfd(Date dateMfd) {
		this.dateMfd = dateMfd;
	}
	public long getPid() {
		return pid;
	}
	
	

	
}
