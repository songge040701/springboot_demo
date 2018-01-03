package com.songge.sb_test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.songge.sb_test.config.SbProperties;
import com.songge.sb_test.domain.Customer;

@RestController
public class CustomerController {
	
	@RequestMapping("/hello")
	public List<Customer> hello() {
		Customer customer = new Customer();
		customer.setId(1);
		
		SbProperties sbProperties = new SbProperties();
		
		customer.setName(sbProperties.getTitle());
		
		List<Customer> cl = new ArrayList<Customer>();
		cl.add(customer);
		return cl;
	}

}
