package com.exercises.pricesapi.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercises.pricesapi.dto.price.PriceDto;
import com.exercises.pricesapi.exception.PriceNotFoundException;
import com.exercises.pricesapi.logic.PriceService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/price")
@Api(tags = {PriceController.TAG_PRICE })
public class PriceController {

	public static final String TAG_PRICE = "Price";
	
	@Autowired
	private PriceService priceService;
	
	@GetMapping("/getPriceDetails/{codBrand}/{codProduct}/{effectiveDate}")
	public ResponseEntity<PriceDto> getNaceDetails(@PathVariable Integer codBrand, @PathVariable Integer codProduct, 
			@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")LocalDateTime effectiveDate) throws PriceNotFoundException {
		
		return new ResponseEntity<>(priceService.getPriceDetails(codBrand, codProduct, effectiveDate), HttpStatus.OK);
	}
	
	@GetMapping("/getAllPriceDetails/")
	public ResponseEntity<List<PriceDto>> getAllPriceDetails() {
		return new ResponseEntity<>(priceService.getAllPriceDetails(), HttpStatus.OK);
	}	
}
