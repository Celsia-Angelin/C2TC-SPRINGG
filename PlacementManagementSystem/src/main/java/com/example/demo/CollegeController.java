package com.example.demo;

import java.util.NoSuchElementException;

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
public class CollegeController {

	@Autowired
	private CollegeService service;   //Reference

//For Create Operation
@PostMapping("/college")
	public void add(@RequestBody College college)
	{
     service.save(college);

    }

//For update Operation
@PutMapping("/ucollege/{id}")
public ResponseEntity<?> update(@RequestBody College college,@PathVariable Integer id)
{
try
{
	service.save(college);
return new ResponseEntity<>(college,HttpStatus.OK);
}
catch (NoSuchElementException e)
{
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
}

//search Operation
@GetMapping("/college/{id}")
public ResponseEntity<College>  get(@PathVariable Long id)
{
try
{
	College college=service.get1(id);
return new ResponseEntity<College>(college,HttpStatus.OK);
}
catch (NoSuchElementException e)
{
	return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
}
}

//Delete operation
@DeleteMapping("/college/{id}")
public void delete(@PathVariable Long id)      
{
service.delete(id);
}

}
