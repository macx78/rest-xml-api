// Java Program to Illustrate Regular controller

package com.techclimber.restxmlapi;

// Importing required classes
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("View")
public class OutputController {
	@GetMapping("/get/{id}")
	public EntityModel getXMLOutput(@PathVariable("id") String id, Model model){
		ConsumeXMLResponse response = new ConsumeXMLResponse();
		ResponseEntity<EntityModel> responseEntity = response.get(id);

		EntityModel entity = responseEntity.getBody();
		HttpHeaders headers = responseEntity.getHeaders();

		
		return entity;
	}
}
