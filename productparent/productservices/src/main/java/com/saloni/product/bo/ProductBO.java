package com.saloni.product.bo;

import com.saloni.product.dto.Product;

public interface ProductBO {
	
	public void create(Product product);
	
	public Product findProduct(int id);
}
