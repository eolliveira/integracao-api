package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
	
		List<Product> products = new ArrayList<>();
		products.add(new Product(1L, "Computer", "personal computer"));
		products.add(new Product(2L, "Notebook", "personal computer"));
		products.add(new Product(3L, "TV", "personal computer"));
		products.add(new Product(4L, "Computer", "personal computer"));
		products.add(new Product(5L, "Notebook", "personal computer"));
		
		return ResponseEntity.ok(products);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product product = new Product(id, "TV", "Tela plana");
		return ResponseEntity.ok(product);
	}
	
	
}
