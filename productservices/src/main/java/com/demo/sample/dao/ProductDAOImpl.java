package com.demo.sample.dao;

import java.util.HashMap;

import com.demo.sample.dto.Product;

public class ProductDAOImpl implements ProductDAO {
	
	private HashMap<Integer, Product> products = new HashMap<>();

	@Override
	public void create(Product product) {
		products.put(product.getId(), product);
	}

	@Override
	public void update(Product product) {
		products.replace(product.getId(), product);
	}

	@Override
	public Product read(int id) {
		// TODO Auto-generated method stub
		return products.get(id);
	}

	@Override
	public void delete(int id) {
		products.remove(id);
	}

}
