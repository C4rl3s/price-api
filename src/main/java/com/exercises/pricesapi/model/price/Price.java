package com.exercises.pricesapi.model.price;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PRICES")
public class Price {

	@EmbeddedId
	private PriceId id;

	@Column(name = "PRICE_LIST")
	private Integer codFee;
	
	@Column(name = "PRIORITY")
	private Integer priority;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "CURR")
	private String currency;
	
	public PriceId getId() {
		return id;
	}

	public void setId(PriceId id) {
		this.id = id;
	}

	public Integer getCodFee() {
		return codFee;
	}

	public void setCodFee(Integer codFee) {
		this.codFee = codFee;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
