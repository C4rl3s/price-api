package com.exercises.pricesapi.logic;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercises.pricesapi.dto.price.PriceDto;
import com.exercises.pricesapi.exception.PriceNotFoundException;
import com.exercises.pricesapi.mapper.PriceMapper;
import com.exercises.pricesapi.model.price.Price;
import com.exercises.pricesapi.repository.PriceRepository;

@Service
public class PriceService {
			
	@Autowired
	private PriceRepository priceRepository;
	
	public PriceDto getPriceDetails(Integer codBrand, Integer codProduct, LocalDateTime effectiveDate) throws PriceNotFoundException{
		List<Price> priceEntityList = priceRepository.findByIdCodBrandAndIdCodProduct(codBrand, codProduct);
		
		Optional<Price> finalPrice = priceEntityList.stream()
				.filter(isBetweenStartDateAndEndDate(effectiveDate))
				.sorted(sortByPriorityDesc()).findFirst();
		
		return PriceMapper.fromEntityToDto(finalPrice.orElseThrow(PriceNotFoundException::new));
	}	
	
	private Predicate<Price> isBetweenStartDateAndEndDate(LocalDateTime effectiveDate) {
		return price -> {
			return (effectiveDate.isAfter(price.getId().getStartDate()) || effectiveDate.equals(price.getId().getStartDate()))
					&& (effectiveDate.isBefore(price.getId().getEndDate()) || effectiveDate.equals(price.getId().getEndDate()));
		};
	}
	
	private Comparator<Price> sortByPriorityDesc() {
		return (price1, price2) -> {
			return price2.getPriority().compareTo(price1.getPriority());
		};
	}
	
	public List<PriceDto> getAllPriceDetails() {
		return PriceMapper.fromEntityListToDtoList(priceRepository.findAll());
	}
}