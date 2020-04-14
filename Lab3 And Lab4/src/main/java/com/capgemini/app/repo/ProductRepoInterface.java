package com.capgemini.app.repo;

import java.util.List;

import com.capgemini.app.entity.Product;

public interface ProductRepoInterface {

	public void create(Product Pproduct);
	public List<Product> reterive();
	public Boolean delete(int id);
}
