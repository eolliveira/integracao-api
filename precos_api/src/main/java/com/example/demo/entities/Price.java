package com.example.demo.entities;

import java.io.Serializable;

public class Price implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Double price;
	
	public Price() {}
	
	public Price(Integer id, Double price) {
		this.id = id;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	

	
}
