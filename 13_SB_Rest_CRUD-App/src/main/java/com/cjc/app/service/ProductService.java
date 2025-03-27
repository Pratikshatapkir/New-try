package com.cjc.app.service;

import java.util.List;

import com.cjc.app.model.Product;

public interface ProductService {

	Product saveProduct(Product product);

	List<Product> getAllProducts();

	Product getProduct(int id);

	List<Product> deleteProduct(int id);

}
