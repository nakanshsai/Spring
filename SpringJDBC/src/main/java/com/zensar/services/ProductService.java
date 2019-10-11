package com.zensar.services;
/**
 * @author akansh_sai
 * @creation_date 4th oct 2019 11:39am
 * @modification_date 10th oct 2019 17:21pm
 * @version 2.0
 * @copyright Zensar technologies. all rights reserved.
 * @description this is interface for product service used in business layer 
 *
 */

import java.util.List;

import com.zensar.entities.Product;

public interface ProductService {
 
	List<Product> findAllProducts();
	Product findProductById(int id);
	void addProduct(Product product);
	void updateProduct(Product product);
	void removeProduct(Product product);
	List<Product> findProductsByPriceRange(float minPrice,float maxPrice);
	List<Product> findProductByName(String name);
	List<Product> findProductByBrand(String brand);
	long getProductCount();
}
