/**
 * Manuel Vieda
 * https://manuelvieda.com
 * Copyright (c) 2016
 */
package com.manuelvieda.oca.arrays;

import java.util.ArrayList;

/**
 * @author Manuel Vieda
 * @version 1.0
 *
 */
public class ArraysHelper {

	/**
	 * Private constructor to avoid class instantiation
	 */
	private ArraysHelper() {

	}

	/**
	 * Creates a sample ArrayList object with the name of the five first digits
	 *
	 * @return Sample ArrayList
	 */
	public static ArrayList<String> createSampleArrayList() {

		final ArrayList<String> myArrayList = new ArrayList<>();
		myArrayList.add("One");
		myArrayList.add("Two");
		myArrayList.add("Three");
		myArrayList.add("Four");
		myArrayList.add("Five");

		return myArrayList;
	}
}
