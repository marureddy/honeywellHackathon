package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;


@RestController
@RequestMapping("/inventory")
public class InventoryController {
	
	
	@PostMapping("/product")
	public Product saveProduct() {
		
		return new Product() ;
		
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
