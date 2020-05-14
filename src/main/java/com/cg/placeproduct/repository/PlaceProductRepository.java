package com.cg.placeproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.placeproduct.model.PlaceProduct;

@Repository
public interface PlaceProductRepository extends JpaRepository<PlaceProduct , Integer>{

}
