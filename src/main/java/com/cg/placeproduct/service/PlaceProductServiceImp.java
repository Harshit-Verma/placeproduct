package com.cg.placeproduct.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.placeproduct.repository.*;
import com.cg.placeproduct.model.*;

@Service
public  class PlaceProductServiceImp implements PlaceProductService {
	@Autowired
	private PlaceProductRepository repo;



	@Override
	public  PlaceProduct placeProductDetails(PlaceProduct placeProduct) {
		
		 return  repo.save(placeProduct);
	}


}
