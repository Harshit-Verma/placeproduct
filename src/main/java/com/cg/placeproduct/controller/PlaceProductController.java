package com.cg.placeproduct.controller;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.placeproduct.model.PlaceProduct;
import com.cg.placeproduct.service.PlaceProductService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(path = "/api")

public class PlaceProductController {

	@Autowired
	private PlaceProductService service;
	
	@Autowired
	EntityManager em;
	
	
	@PostMapping("/place/{orderId}")
	public PlaceProduct PlaceProductDetails(@RequestBody PlaceProduct placeProduct) {
			
			return service.placeProductDetails(placeProduct);
		}
		
		
		
	}

