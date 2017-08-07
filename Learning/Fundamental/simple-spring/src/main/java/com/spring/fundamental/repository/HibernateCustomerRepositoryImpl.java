package com.spring.fundamental.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring.fundamental.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	private String dbUsername;
	
	/**
	 * @param dbUsername the dbUsername to set
	 */
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	/* (non-Javadoc)
	 * @see com.spring.fundamental.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println(String.format("dbUsername %s", dbUsername));
		List<Customer> customers = new ArrayList<>();

		Customer c = new Customer();
		c.setFirstname("Thai");
		c.setLastname("Nguyen");
		customers.add(c);

		return customers;
	}
}
