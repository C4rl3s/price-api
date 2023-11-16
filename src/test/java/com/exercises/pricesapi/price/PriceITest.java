package com.exercises.pricesapi.price;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import com.exercises.pricesapi.dto.price.PriceDto;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class PriceITest {

    public static final String LOCALHOST = "http://localhost:";
    public static final String SERVICE_PATH = "/price";

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    ParameterizedTypeReference<List<PriceDto>> responseType = new ParameterizedTypeReference<List<PriceDto>>() {
    };

    @Test
    public void testOne() {
    	
    	Double expectedPrice = 35.50;

    	ResponseEntity<PriceDto> response = restTemplate
				.getForEntity(LOCALHOST + port + SERVICE_PATH + "/getPriceDetails/" + "1" + "/" + "35455" + "/" + "2020-06-14 10:00:00", PriceDto.class);

		assertNotNull(response.getBody());
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(expectedPrice, response.getBody().getPrice());
    }
    
    @Test
    public void testTwo() {
    	
    	Double expectedPrice = 25.45;

    	ResponseEntity<PriceDto> response = restTemplate
				.getForEntity(LOCALHOST + port + SERVICE_PATH + "/getPriceDetails/" + "1" + "/" + "35455" + "/" + "2020-06-14 16:00:00", PriceDto.class);

		assertNotNull(response.getBody());
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(expectedPrice, response.getBody().getPrice());
    }
    
    @Test
    public void testThree() {
    	
    	Double expectedPrice = 35.50;

    	ResponseEntity<PriceDto> response = restTemplate
				.getForEntity(LOCALHOST + port + SERVICE_PATH + "/getPriceDetails/" + "1" + "/" + "35455" + "/" + "2020-06-14 21:00:00", PriceDto.class);

		assertNotNull(response.getBody());
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(expectedPrice, response.getBody().getPrice());
    }
    
    @Test
    public void testFour() {
    	
    	Double expectedPrice = 30.50;

    	ResponseEntity<PriceDto> response = restTemplate
				.getForEntity(LOCALHOST + port + SERVICE_PATH + "/getPriceDetails/" + "1" + "/" + "35455" + "/" + "2020-06-15 10:00:00", PriceDto.class);

		assertNotNull(response.getBody());
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(expectedPrice, response.getBody().getPrice());
    }
    
    @Test
    public void testFive() {
    	
    	Double expectedPrice = 38.95;

    	ResponseEntity<PriceDto> response = restTemplate
				.getForEntity(LOCALHOST + port + SERVICE_PATH + "/getPriceDetails/" + "1" + "/" + "35455" + "/" + "2020-06-16 21:00:00", PriceDto.class);

		assertNotNull(response.getBody());
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(expectedPrice, response.getBody().getPrice());
    }

}