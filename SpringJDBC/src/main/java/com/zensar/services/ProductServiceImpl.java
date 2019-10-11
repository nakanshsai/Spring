package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.daos.ProductDao;
import com.zensar.daos.ProductDaoImpl;
import com.zensar.entities.Product;
/**
 * @author akansh_sai
 * @creation date 4th oct 2019 11:49am
 * @modification date 10th oct 2019 17:21pm
 * @version 2.0
 * @copyright Zensar technologies. all rights reserved.
 * @description this implements product service interface used in business layer 
 *
 */
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	
	@Override
	public List<Product> findAllProducts() {
		
		return productDao.getAll();
	}

	@Override
	public Product findProductById(int id) {
		
		return productDao.getById(id);
	}

	@Override
	public void addProduct(Product product) {
		
		productDao.insert(product);

	}

	@Override
	public void updateProduct(Product product) {
		
		productDao.update(product);
	}

	@Override
	public void removeProduct(Product product) {
		
		productDao.delete(product);
	}

	@Override
	public List<Product> findProductsByPriceRange(float minPrice, float maxPrice) {
		List<Product> products=	productDao.getAll();
		List<Product> rp = new ArrayList<Product>();
		for(Product p:products) {
			float price = p.getPrice();
			if(price>=minPrice && price<=maxPrice) {
				rp.add(p);
			}
		}
		return rp;
	}

	@Override
	public List<Product> findProductByName(String name) {
		List<Product> products=	productDao.getAll();
		List<Product> rp = new ArrayList<Product>();
		for(Product p:products) {
			
			if(p.getName().contains(name)) {
				rp.add(p);
			}
		}
		return rp;
	}

	@Override
	public List<Product> findProductByBrand(String brand) {
		List<Product> products=	productDao.getAll();
		List<Product> rp = new ArrayList<Product>();
		for(Product p:products) {
			if(p.getBrand().contains(brand)) {
				rp.add(p);
			}
		}
		return rp;
	}

	@Override
	public long getProductCount() {
	List<Product> product=	productDao.getAll();
	int count = 0;
		for(Product p:product) {
			 count= count+1;
		}
		return count;
	}

}
