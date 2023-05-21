package com.FoodboxBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FoodboxBackend.entities.Product;
import com.FoodboxBackend.repo.ProductRepo;
import com.FoodboxBackend.service.ProductService;


@RestController
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;

	@Autowired
	private ProductRepo productRepo;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@GetMapping("/getProducts")
	public List<Product> getProducts() {
		return productService.getProducts();
	}

	
	
}
