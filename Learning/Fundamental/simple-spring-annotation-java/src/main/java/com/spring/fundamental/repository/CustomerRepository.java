package com.spring.fundamental.repository;

import java.util.List;

import com.spring.fundamental.model.Customer;

public interface CustomerRepository {

	/**
	 * @return
	 */
	List<Customer> findAll();

}