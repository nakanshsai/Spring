package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

/**
 * @author akansh_sai
 * @creation date 4th oct 2019 11:49am
 * @modification date 10th oct 2019 17:21pm
 * @version 1.0
 * @copyright Zensar technologies. all rights reserved.
 * @description main class 
 *
 */
public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbconfig.xml");
		ProductService productService = ctx.getBean("productServiceImpl",ProductService.class);
		List<Product> product = productService.findAllProducts();
		for(Product p:product) {
			System.out.println(p);
		}
		/*
		 * System.out.println(); System.out.println("Product is");
		 */
		/*
		 * Product p1= productService.findProductById(1001); if(p1!=null) {
		 * p1.setPrice(10000); productService.updateProduct(p1);
		 * 
		 * } else { System.out.println("product not found"); }
		 */
		/* System.out.println(p1); */
		/*
		 * Product product1 = new Product(1111, "phone","nokia" ,15000);
		 * productService.addProduct(product1);
		 */
		/*
		 * Product p2= productService.findProductById(1001); if(p2!=null) {
		 * 
		 * productService.removeProduct(p2);
		 * 
		 * } else { System.out.println("product not found"); }
		 */
		
	}

}
