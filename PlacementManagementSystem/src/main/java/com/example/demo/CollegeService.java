package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CollegeService {
@Autowired
	private CollegeRepository repo;
 	
public void save(College college) 
{
		repo.save(college);
		
}

public College get(Integer id) {
	return null;
}

// For Search
public College get1(Long id)
{
return repo.findById(id).get(); //inbuilt
}

//For Delete
public void delete(Long id) {
	repo.deleteById(id);
	
}

}
