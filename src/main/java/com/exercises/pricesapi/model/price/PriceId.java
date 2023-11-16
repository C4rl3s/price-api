package com.exercises.pricesapi.model.price;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PriceId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PriceId(Integer codBrand, Integer codProduct, LocalDateTime startDate, LocalDateTime endDate) {
		this.codBrand = codBrand;
		this.codProduct = codProduct;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public PriceId() {
		super();
	}

	@Column(name = "BRAND_ID")
	private Integer codBrand;
	
	@Column(name = "PRODUCT_ID")
	private Integer codProduct;

	@Column(name = "START_DATE")
	private LocalDateTime startDate;

	@Column(name = "END_DATE")
	private LocalDateTime endDate;
	
	public Integer getCodBrand() {
		return codBrand;
	}

	public void setCodBrand(Integer codBrand) {
		this.codBrand = codBrand;
	}
	
	public Integer getCodProduct() {
		return codProduct;
	}

	public void setCodProduct(Integer codProduct) {
		this.codProduct = codProduct;
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
}
