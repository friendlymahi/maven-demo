package com.demo.sample.dao;

import com.demo.sample.dto.Product;

public interface ProductDAO {	
	void create(Product product);
	void update(Product product);
	Product read(int id);
	void delete(int id);
}
