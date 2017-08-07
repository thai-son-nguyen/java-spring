package com.spring.fundamental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.fundamental.model.Customer;
import com.spring.fundamental.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	/* (non-Javadoc)
	 * @see com.spring.fundamental.service.CustomerService#findAll()
	 */
	
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
