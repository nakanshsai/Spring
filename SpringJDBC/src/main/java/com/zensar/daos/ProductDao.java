package com.zensar.daos;

import java.util.List;



import com.zensar.entities.Product;

/**
 * @author akansh_sai
 * @creation_date 4th oct 2019 9:53am
 * @modification_date 10th oct 2019 9:53am
 * @version 2.0
 * @copyright Zensar technologies. all rights reserved.
 * @description dao interface using persistence layer
 *
 */
public interface ProductDao {
	
	List<Product> getAll(); 
	Product getById(int id);
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
}
