package com.exercises.pricesapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercises.pricesapi.model.price.Price;
import com.exercises.pricesapi.model.price.PriceId;

public interface PriceRepository extends JpaRepository<Price, PriceId>{

	public List<Price> findByIdCodBrandAndIdCodProduct(Integer codBrand, Integer codProduct);
}
