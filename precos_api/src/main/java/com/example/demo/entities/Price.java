package com.example.demo.entities;

import java.io.Serializable;

public class Price implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long ind;
	private Double price;
	
	public Price () {}
	
	public Price(Long ind, Double price) {
		super();
		this.ind = ind;
		this.price = price;
	}
	public Long getInd() {
		return ind;
	}
	public void setInd(Long ind) {
		this.ind = ind;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
