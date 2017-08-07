/**
 * 
 */
package com.spring.fundamental.model;

/**
 * @author Thai
 *
 */
public class Customer {
	private String firstname;
	private String lastname;
	
	public Customer() {
		
	}
	
	/**
	 * @return the first name
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @return the last name
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param firstname the first name to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @param lastname the last name to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
