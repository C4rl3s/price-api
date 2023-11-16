package com.exercises.pricesapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Price Not Found")
public class PriceNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

}