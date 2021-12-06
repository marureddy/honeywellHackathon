package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;


@RestController
@RequestMapping("/inventory")
public class InventoryController {
	
	@Autowired
	ProductRepository productRepository;
	
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product) {
		Product productSaved = productRepository.save(product);
		
		return productSaved ;
		
	}
	
	@GetMapping("/products")
	public List<Product>  getProducts() {
		Product  p1 = new Product();
		p1.setName("Spinach");
		List<Product> list = new ArrayList<Product>();
		list.add(p1);
		
		return list; 
		
	}

}
