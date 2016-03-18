/**
 * Manuel Vieda
 * https://manuelvieda.com
 * Copyright (c) 2016
 */
package com.manuelvieda.oca.model;

/**
 * @author Manuel Vieda
 * @version 1.0
 */
public abstract class Person {

	/**
	 * The first name of the person
	 */
	private String firstName;

	/**
	 * The last name of the person
	 */
	private String lastName;

	/**
	 * Creates an empty person. Default constructor.
	 */
	public Person() {
	}

	/**
	 * Creates a person with the first and last name
	 *
	 * @param firstName The fist name of the person being created
	 * @param lastName The last name of the person being created
	 */
	public Person(final String firstName, final String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Returns the first name of the person
	 *
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Returns the last name of the person
	 *
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the first name of the person
	 *
	 * @param firstName the firstName to set
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Sets the last name of the person
	 *
	 * @param lastName the lastName to set
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

}
