package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Price;
@RestController
@RequestMapping(value = "/prices")
public class PriceController {

	@GetMapping
	private ResponseEntity<List<Price>> findAll(){
	
		List<Price> prices = new ArrayList<>();
		prices.add(new Price(1L, 50.0));
		prices.add(new Price(2L, 20.2));
		prices.add(new Price(3L, 40.0));
		prices.add(new Price(4L, 65.0));
		prices.add(new Price(5L, 24.0));
		
		return ResponseEntity.ok(prices);
		
	}
}
