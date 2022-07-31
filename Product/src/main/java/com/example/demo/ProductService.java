package com.example.demo;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class ProductService 
{
@Autowired
	private ProductRepository repo;

	public List<Product> listAll() {
		return repo.findAll();
}

public void save(Product product) 
{
		repo.save(product);
		
}

public Product get1(Integer id)
{
return repo.findById(id).get(); //inbuilt
}

public void delete(Integer id) 
{

repo.deleteById(id);	
}

public Product get(Integer id) {
	// TODO Auto-generated method stub
	return null;
}

}
