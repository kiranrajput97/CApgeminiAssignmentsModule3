package com.capgemini.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capgemini.app.entity.Product;
import com.capgemini.app.repo.ProductRepoInterface;

@Transactional
@Service
public class MyService implements MyServiceInterface {

	@Autowired
	private ProductRepoInterface pr;

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		pr.create(product);
		return product;
	}

	@Override
	public List<Product> reterive() {
		// TODO Auto-generated method stub
		return pr.reterive();
	}

	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		
		return pr.delete(id);
	}

}
