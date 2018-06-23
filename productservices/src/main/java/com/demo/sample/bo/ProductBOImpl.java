package com.demo.sample.bo;

import com.demo.sample.dao.ProductDAO;
import com.demo.sample.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private ProductDAO productDao;

	@Override
	public void createProduct(Product product) {
		productDao.create(product);
	}

	@Override
	public Product findProduct(int productid) {
		return productDao.read(productid);
	}

	public ProductDAO getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDAO productDao) {
		this.productDao = productDao;
	}
	
}
