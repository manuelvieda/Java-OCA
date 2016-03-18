/**
 * Manuel Vieda
 * https://manuelvieda.com
 * Copyright (c) 2016
 */
package com.manuelvieda.oca.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * An iterator is a mechanism that permits all elements of a collection to be accessed sequentially, with some operation
 * being performed on each element.
 *
 * @author Manuel Vieda
 * @version 1.0
 */
public class IteratorOverArrayList {

	/**
	 * Passive iterator (forEach)
	 */
	public void forEachIteration() {

		final ArrayList<String> myArrayList = ArraysHelper.createSampleArrayList();

		System.out.println("ForEach Iteration: ");
		myArrayList.forEach(item -> System.out.print(item + ", "));
		myArrayList.forEach(System.out::println);

	}

	/**
	 *
	 */
	public void genericIterator() {

		final ArrayList<String> myArrayList = ArraysHelper.createSampleArrayList();

		System.out.println("Generic Iterator: ");
		final Iterator<String> iterator = myArrayList.iterator();

		while (iterator.hasNext()) {
			final String number = iterator.next();
			System.out.println("  - " + number);
		}

	}

	/**
	 *
	 */
	public void listIterator() {

		final ArrayList<String> myArrayList = ArraysHelper.createSampleArrayList();

		System.out.println("List Iterator: ");

		System.out.println("* From the begining:");
		ListIterator<String> iterator = myArrayList.listIterator();
		while (iterator.hasNext()) {
			final String number = iterator.next();
			System.out.println("  - " + number);
		}

		System.out.println("* From the positon 4:");
		iterator = myArrayList.listIterator(3);
		while (iterator.hasNext()) {
			final String number = iterator.next();
			System.out.println("  - " + number);
		}

		System.out.println("* From the positon 3 backwards:");
		iterator = myArrayList.listIterator(3);
		while (iterator.hasPrevious()) {
			final String number = iterator.previous();
			System.out.println("  - " + number);
		}

	}

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(final String[] args) {

		final IteratorOverArrayList iteratorOverArrayList = new IteratorOverArrayList();
		iteratorOverArrayList.forEachIteration();
		iteratorOverArrayList.genericIterator();
		iteratorOverArrayList.listIterator();

	}

}
