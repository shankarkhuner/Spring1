package com.cyber.success.CSJ30SpringBootMVCDemo1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Product;
import com.cyber.success.CSJ30SpringBootMVCDemo1.reposetory.ProductRepository;
import com.cyber.success.CSJ30SpringBootMVCDemo1.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository repository;
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		Product productObj=repository.save(product);
		return null;
	}

	@Override
	public List<Product> viewAllProducts() {
	List<Product> listOfProduct =repository.findAll();
		return listOfProduct;
	}

	@Override
	public Product getProductById(long productId) {
		// TODO Auto-generated method stub
		Product product=repository.findById(productId).get();
		return product;
	}

	@Override
	public int updateProduct(long productId, Product newProd) {
		// TODO Auto-generated method stub
		return repository.updateMyProject(productId, newProd.getProductPrice(), newProd.getProductName());
	}

	@Override
	public void deleteProduct(long ProductId) {
		// TODO Auto-generated method stub
		
		
	}



}
