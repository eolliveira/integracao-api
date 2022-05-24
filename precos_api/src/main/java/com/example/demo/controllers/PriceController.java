package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Price;
@RestController
@RequestMapping(value = "/prices")
public class PriceController {

	@GetMapping
	private ResponseEntity<List<Price>> findAll(){
	
		List<Price> prices = new ArrayList<>();
		prices.add(new Price(1, 50.0));
		prices.add(new Price(2, 20.2));
		prices.add(new Price(3, 40.0));
		prices.add(new Price(4, 65.0));
		prices.add(new Price(5, 24.0));
		return ResponseEntity.ok(prices);
		
	}
	
	@GetMapping(value = "/{id}")
	private ResponseEntity<Price> findById(@PathVariable Integer id){
		Price price = new Price(id, 60.2);
		return ResponseEntity.ok(price);
	}
	
}
