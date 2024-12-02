package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> getData();
	boolean saveProduct(Product p);
	boolean removeById(int pid);
	Product findById(int pid);
	boolean modifyProd(Product p);

}