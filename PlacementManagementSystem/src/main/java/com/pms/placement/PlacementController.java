package com.pms.placement;


import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
//import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

//@Repository
@RestController
public class PlacementController {

	@Autowired
	private PlacementService service;
	@GetMapping("/placement")
	 public List<Placement> list() 
	 {
	 return service.listAll();
	 }
	 @GetMapping("/placement/{id}")
	 public ResponseEntity<Placement> get(@PathVariable Long id) 
	 {
	 try
	 {
		 Placement placement = service.get(id);
	 return new ResponseEntity<Placement>(placement, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // for Create operation
	 @PostMapping("/placement")
	 public void add(@RequestBody Placement placement) 
	 {
	
	service.save(placement);
	 }
	 
	 //  for Update operation
	 @PutMapping("/placement/{id}")
	 public ResponseEntity<?> update(@RequestBody Placement placement, @PathVariable Long id) 
	 {
	 try
	 {
		 
	 service.save(placement);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 //  for Delete operation
	 @DeleteMapping("/placement/{id}")
	 public void delete(@PathVariable Long id) 
	 {
	 service.delete(id);
	 }
	
	
}