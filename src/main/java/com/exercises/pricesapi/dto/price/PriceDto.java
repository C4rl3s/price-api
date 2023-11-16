package com.exercises.pricesapi.dto.price;

import java.time.LocalDateTime;


public class PriceDto {

	private Integer codBrand;
	
	private LocalDateTime startDate;

	private LocalDateTime endDate;

	private Integer codFee;
	
	private Integer codProduct;
	
	private Double price;
	
	public Integer getCodBrand() {
		return codBrand;
	}

	public void setCodBrand(Integer codBrand) {
		this.codBrand = codBrand;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Integer getCodFee() {
		return codFee;
	}

	public void setCodFee(Integer codFee) {
		this.codFee = codFee;
	}

	public Integer getCodProduct() {
		return codProduct;
	}

	public void setCodProduct(Integer codProduct) {
		this.codProduct = codProduct;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}

