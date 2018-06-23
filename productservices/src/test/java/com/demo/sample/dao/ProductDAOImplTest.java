package com.demo.sample.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.sample.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		Product product = new Product();
		product.setId(1234);
		product.setDescription("iPad");
		product.setPrice("360");
		
		ProductDAO daoObject = new ProductDAOImpl();
		
		daoObject.create(product);
		
		assertNotNull(daoObject.read(1234));
	}

}
