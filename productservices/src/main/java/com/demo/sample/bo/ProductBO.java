package com.demo.sample.bo;

import com.demo.sample.dto.Product;

public interface ProductBO {
	
	public void createProduct(Product product);
	public Product findProduct(int productid);

}
