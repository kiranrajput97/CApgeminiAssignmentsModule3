package com.capgemini.app.service;

import java.util.List;


import com.capgemini.app.entity.Product;

public interface MyServiceInterface {

	public Product save(Product product);

	public List<Product> reterive();

	public Boolean delete(int id);

}
