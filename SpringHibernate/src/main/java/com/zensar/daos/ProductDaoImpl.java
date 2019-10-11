package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;
/**
 * @author akansh_sai
 * @creation date 4th oct 2019 10:23am
 * @modification date 11th oct 2019 10:10am
 * @version 3.0
 * @copyright Zensar technologies. all rights reserved.
 * @description this class implement dao used in persistence layer
 */
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Product> getAll() {
		
		return (List<Product>) hibernateTemplate.find("from Product");
	}

	@Override
	public Product getById(int id) {
	
		return hibernateTemplate.get(Product.class, id);
	}

	@Override
	public void insert(Product product) {
		hibernateTemplate.save(product);
		
	}

	@Override
	public void update(Product product) {
		hibernateTemplate.update(product);
		
	}

	@Override
	public void delete(Product product) {
		hibernateTemplate.delete(product);
		
	}
	
	
}
