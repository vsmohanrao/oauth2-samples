package com.mu.samples.basicauth.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	

	@RequestMapping(value = "/api/customer/{id}", method = RequestMethod.GET)
	public String getCustomer(@PathVariable String id) {
		return "customer returned";
	}

	@RequestMapping(value = "/api/customer/create", method = RequestMethod.POST)
	public String createCustomer() {
		return "customer created";
	}

	@RequestMapping(value = "/api/customer/{id}", method = RequestMethod.PUT)
	public String editCustomer(@PathVariable String id) {
		return "customer updated";
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping(value = "/api/customer/{id}", method = RequestMethod.DELETE)
	public String deleteCustomer(@PathVariable String id) {
		return "customer deleted";
	}
	
}
