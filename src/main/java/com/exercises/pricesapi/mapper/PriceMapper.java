package com.exercises.pricesapi.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.exercises.pricesapi.dto.price.PriceDto;
import com.exercises.pricesapi.model.price.Price;

public class PriceMapper {

	public static PriceDto fromEntityToDto(Price entity) {
		
		var priceDto = new PriceDto();
		priceDto.setCodBrand(entity.getId().getCodBrand());
		priceDto.setStartDate(entity.getId().getStartDate());
		priceDto.setEndDate(entity.getId().getEndDate());
		priceDto.setCodFee(entity.getCodFee());
		priceDto.setCodProduct(entity.getId().getCodProduct());
		priceDto.setPrice(entity.getPrice());
		
		return priceDto;
	}
	
	public static List<PriceDto> fromEntityListToDtoList(List<Price> priceEntityList) {
		return priceEntityList.stream().map(PriceMapper::fromEntityToDto).collect(Collectors.toList());
		
//		List<PriceDto> priceDtoList = new ArrayList<>();
//		priceEntityList.forEach(entity -> priceDtoList.add(fromEntityToDto(entity)));
//		
//		return priceDtoList;
	}
	
}
