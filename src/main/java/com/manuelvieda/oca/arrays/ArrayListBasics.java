/**
 * Manuel Vieda
 * https://manuelvieda.com
 * Copyright (c) 2016
 */
package com.manuelvieda.oca.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.manuelvieda.oca.model.Student;

/**
 * Here are a few more important properties of an ArrayList:
 * <ul>
 * <li>It implements the interface List.
 * <li>It allows null values to be added to it.
 * <li>It implements all list operations (add, modify, and delete values).
 * <li>It allows duplicate values to be added to it.
 * <li>It maintains its insertion order.
 * <li>You can use either Iterator or ListIterator (an implementation of the Iterator interface) to iterate over the
 * items of an ArrayList.
 * <li>It supports generic, making it type safe. (You have to declare the type of the elements that should be added to
 * an ArrayList with its declaration.)
 * </ul>
 *
 * @author Manuel Vieda
 * @version 1.0
 */
public class ArrayListBasics {

	/**
	 * Must import from java.util package to use the short notation.
	 * <p>
	 * The initial capacity is 16 elements.
	 * <p>
	 * Can be initialized from another collection
	 */
	@SuppressWarnings("unused")
	public void createArrayList() {

		// The initial capacity is 16 elements.
		final ArrayList<String> myArrayList = new ArrayList<>();

		// Define a custom initial capacity
		final ArrayList<String> myArrayList2 = new ArrayList<>(10);

		// Create from another arrayList/Collection
		final ArrayList<String> myArrayList3 = new ArrayList<>(myArrayList);

	}

	/**
	 * ArrayList preservers the insertion order
	 * <ul>
	 * <li>add(Object)
	 * <li>add(position, Object)
	 * <li>addAll(collection)
	 * <li>addAll(index, collection)
	 * </ul>
	 */
	public void addData() {

		final ArrayList<String> myArrayList = new ArrayList<>();

		myArrayList.add("One");
		myArrayList.add("Two");
		myArrayList.add("Five");
		System.out.println(myArrayList);

		myArrayList.add(2, "Four");
		myArrayList.add(2, "Three");
		System.out.println(myArrayList);

		final ArrayList<String> mySecondArrayList = new ArrayList<>();
		mySecondArrayList.add("Six");
		mySecondArrayList.add("Seven");
		mySecondArrayList.add("Eigth");
		mySecondArrayList.add("Nine");
		mySecondArrayList.add("Ten");
		System.out.println(mySecondArrayList);

		myArrayList.addAll(mySecondArrayList);
		System.out.println(myArrayList);

	}

	/**
	 *
	 */
	public void accessingArrayListData() {

		final ArrayList<String> myArrayList = ArraysHelper.createSampleArrayList();

		System.out.println("Using enhanced for: ");
		for (final String number : myArrayList) {
			System.out.println("* " + number);
		}

		System.out.println("Using iterator: ");
		final Iterator<String> iterator = myArrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println("* " + iterator.next());
		}

		System.out.println("Using List iterator: ");
		final ListIterator<String> listIterator = myArrayList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println("* " + listIterator.next());
		}

		System.out.println("Direct acces to a given position: ");
		System.out.println("* " + myArrayList.get(0));
		System.out.println("* " + myArrayList.get(1));
		System.out.println("* " + myArrayList.get(2));

		try {
			System.out.println("* " + myArrayList.get(10));
		} catch (final IndexOutOfBoundsException exception) {
			// IndexOutOfBoundsException for invalid positions
		}
	}

	/**
	 * Modify data from an array using set(position, newElement)
	 */
	public void modifyData() {

		final ArrayList<String> myArrayList = ArraysHelper.createSampleArrayList();
		System.out.println("Original List:");
		System.out.println(myArrayList);

		myArrayList.set(0, "New One");
		myArrayList.set(3, "New Four");

		System.out.println("Modified List:");
		System.out.println(myArrayList);

	}

	/**
	 *
	 */
	public void referencesWithinMultipleArrays() {

		final Student student1 = new Student("Manuel", "Vieda");

		final ArrayList<Student> listOne = new ArrayList<>();
		listOne.add(student1);

		final ArrayList<Student> listTwo = new ArrayList<>();
		listTwo.add(student1);

		System.out.println("\nChange first name to the object...");
		student1.setFirstName("New Manuel");
		System.out.println("Student Object: " + student1.getFirstName());
		System.out.println("Student List One: " + listOne.get(0).getFirstName());
		System.out.println("Student List Two: " + listTwo.get(0).getFirstName());

		System.out.println("\nChange last name to the object inside first arrayList...");
		listOne.get(0).setLastName("New Vieda");
		System.out.println("Student Object: " + student1.getLastName());
		System.out.println("Student List One: " + listOne.get(0).getLastName());
		System.out.println("Student List Two: " + listTwo.get(0).getLastName());
	}

	/**
	 * Test ArrayList
	 */
	public static void main(final String[] args) {

		final ArrayListBasics arrayListBasics = new ArrayListBasics();
		arrayListBasics.createArrayList();
		arrayListBasics.addData();
		arrayListBasics.accessingArrayListData();
		arrayListBasics.modifyData();
		arrayListBasics.referencesWithinMultipleArrays();
	}

}
