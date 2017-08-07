package com.spring.fundamental.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.spring.fundamental.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
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
