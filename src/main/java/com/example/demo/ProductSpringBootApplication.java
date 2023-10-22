package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import Product.demo.Product;
import ProductService.demo.ProductService;


@SpringBootApplication
public class ProductSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(ProductSpringBootApplication.class, args);
		
		ProductService service=context.getBean(ProductService.class);
	    
		
		List<Product> products=service.getAllProducts();
		for(Product p :products) {
			System.out.println(p);
		}
	}

}
