package com.cjc.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cjc.app.model.Product;
import com.cjc.app.repository.ProductRepository;
import com.cjc.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository repository;

	public ProductServiceImpl(ProductRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Product saveProduct(Product product) {
		
		System.out.println("In service layer:"+ product);
		Product pro=repository.save(product);
		 return pro;
	}
	
@Override
	public List<Product> getAllProducts() {
		 return repository.findAll();
	}	
@Override
public Product getProduct(int id) {
	 Optional<Product> optional=repository.findById(id);
	 if(optional.isPresent()) {
		 return optional.get();
	 }
	 return null;
}
@Override
public List<Product> deleteProduct(int id) {
	 repository.deleteById(id);
	 return getAllProducts();
}

}
