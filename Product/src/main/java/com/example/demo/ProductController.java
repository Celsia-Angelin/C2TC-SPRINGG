package com.example.demo;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController {

@Autowired
private ProductService service;   //Reference variable

//Restful API methods for retrieval operations
@GetMapping("/products")
public List<Product> list()
{
return service.listAll();	
}

//Retrieval on the basis of Id
@GetMapping("/products/(id)")
public ResponseEntity<Product>  get(@PathVariable Integer id)
{
try
{
	Product product=service.get(id);
return new ResponseEntity<Product>(product,HttpStatus.OK);
}
catch (NoSuchElementException e)
{
	return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
}
}

//RESTful API method for create operation
@PostMapping("/products")
public void add(@RequestBody Product product)
{
service.save(product);

}

//RESTful API method for Update operation
@PutMapping("/products/(id)")
public ResponseEntity<?> update(@RequestBody Product product,@PathVariable Integer id)
{
try
{
	Product existproduct=service.get(id);
	service.save(product);
return new ResponseEntity<>(product,HttpStatus.OK);
}
catch (NoSuchElementException e)
{
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
}

//RESTful API method for Delete operation
@DeleteMapping("/products/(id)")
public void delete(@PathVariable Integer id)      
{
service.delete(id);
}
}
