package com.springrest.springrest.controller;
import java.util.List;

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

import com.springrest.springrest.entities.Load;
import com.springrest.springrest.services.LoadService;

@RestController
public class MyController {
	@Autowired
	private LoadService loadServi;
  @GetMapping("/home")
  public String home() {
	  
	return "home page ";
   }
  // get load
  @GetMapping("/Load")
  public List<Load> payLoad()
  {
	  return this.loadServi.payLoad();
	  
  }
  @GetMapping("/Load/{loadId}")
  public Load payLoads(@PathVariable String loadId)
  {
	  return this.loadServi.payLoads(Long.parseLong(loadId));
  }
 
 @PostMapping(path="/Load",consumes="application/json")
  public Load addLoad(@RequestBody Load load)
  {
   	  return this.loadServi.addLoad(load);
  }
 //update by put 
 @PutMapping("/Load/{loadId}")
 public Load updateLoad(@RequestBody Load load)
 {
	 return this.loadServi.updateLoad(load);
 }
 // delete data
 @DeleteMapping("/Load/{loadId}")
 public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId)
 {
	try
	{
		this.loadServi.deleteLoad(Long.parseLong(loadId));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	catch (Exception e)
	{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
 }
 
}
