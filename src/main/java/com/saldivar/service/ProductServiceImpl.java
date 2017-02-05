package com.saldivar.service;

import org.springframework.stereotype.Service;

import com.saldivar.domain.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private Product p;
	
	public ProductServiceImpl () {
		Product product = new Product();
		product.setName("Product name");
		p = product;
	}
	
	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return p;
	}

}
