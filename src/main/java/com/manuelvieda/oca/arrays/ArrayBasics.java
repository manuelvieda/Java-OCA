/**
 * Manuel Vieda
 * https://manuelvieda.com
 * Copyright (c) 2016
 */
package com.manuelvieda.oca.arrays;

/**
 * An array is an object that stores a collection of values. The array is an object itself!.
 *
 * @author Manuel Vieda
 * @version 1.0
 */
public class ArrayBasics {

	/**
	 * An array is an object that stores a collection of values. The array is an object itself.
	 * <p>
	 * Creating an array involves three steps, as follows:
	 * <ul>
	 * <li>Declaring the array
	 * <li>Allocating the array
	 * <li>Initializing the array elements</li>
	 */
	public void oneDimensionArrayBasics() {

		// Declaration
		int[] intArray;
		double doubleArray[];
		String[] stringArray;

		// Allocation
		intArray = new int[5];
		doubleArray = new double[3];
		stringArray = new String[2];

		// Initialization
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;
		intArray[4] = 50;

		doubleArray[0] = 10.5;
		doubleArray[1] = 23.9;
		doubleArray[2] = 50.0;

		stringArray[0] = "Java OCA";
		stringArray[1] = "Preparation";

		// Declaration and allocation in the same line
		final int[] numbers = new int[5];
		numbers[0] = 50;
		numbers[1] = 51;
		numbers[2] = 52;
		numbers[3] = 53;
		numbers[4] = 54;

		final boolean[] boolArray = new boolean[3];
		boolArray[0] = true;
		boolArray[1] = false;
		boolArray[2] = true;

		// Declaration, allocation and initialization in the same line
		final int[] digits = { 11, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		digits[0] = 0;

		System.out.println("IntArray: " + intArray);
		System.out.println("StringArray: " + stringArray);
		System.out.println("BoolArray: " + boolArray);
		System.out.println("Digits: " + digits);

	}

	/**
	 * Once allocated, the elements store their default values.
	 */
	public void defaultValues() {

		final String[] array1 = new String[3];
		final int[] array2 = new int[5];
		final boolean[] array3 = new boolean[4];

		System.out.println("\n String array, default values: ");
		for (final String s : array1) {
			System.out.print(s + ", ");
		}

		System.out.println("\n Integer array, default values: ");
		for (final int i : array2) {
			System.out.print(i + ", ");
		}

		System.out.println("\n Boolean array, default values: ");
		for (final boolean b : array3) {
			System.out.print(b + ", ");
		}

	}

	/**
	 * Arrays can declare multiple dimensions. A matrix can be represented as a 2 dimension array.
	 */
	public void multidimensionalSymetricArrays() {

		final int[][] squareMatrix = new int[5][5];
		// int squareMatrix[][] = new int[5][5]; // The same as the first line
		// int[] squareMatrix[] = new int[5][5]; // The same as the first line

		int counter = 0;
		for (int i = 0; i < squareMatrix.length; i++) {
			for (int j = 0; j < squareMatrix[i].length; j++) {
				squareMatrix[i][j] = counter++;
			}
		}

		System.out.println("2-Dimensional symetric array - Matrix");
		for (final int[] element : squareMatrix) {
			for (final int element2 : element) {
				System.out.print(element2 + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * An array can declare multiple sizes on each sub-array. The initial declaration can define only the size of the
	 * principal array container.
	 */
	public void multidimensionalAsymetricArrays() {

		// int[][] squareMatrix = new int[5][];
		// int squareMatrix[][] = new int[5][];
		final int[] squareMatrix[] = new int[5][];

		int counter = 0;
		for (int i = 0; i < squareMatrix.length; i++) {
			squareMatrix[i] = new int[1 + (int) (Math.random() * 5)];
			for (int j = 0; j < squareMatrix[i].length; j++) {
				squareMatrix[i][j] = counter++;
			}
		}

		System.out.println("2-Dimensional Asymetric array");
		for (final int[] element : squareMatrix) {
			for (final int element2 : element) {
				System.out.print(element2 + "\t");
			}
			System.out.println();
		}

	}

	/**
	 * For accessing/modifying data, use brackets to indicate the position that will be read/write
	 */
	public void accesingData() {

		final String[] cities = { "New York", "Paris", "Venice", "San Francisco", "Bogota", "Buenos Aires" };

		System.out.println(cities[0]);
		System.out.println(cities[(byte) 1]);
		System.out.println(cities[(char) 2]);
		System.out.println(cities[0b0000_0101]);

		try {
			System.out.println(cities[6]);
		} catch (final ArrayIndexOutOfBoundsException exception) {
			// Code to access an array index will throw a runtime exception if
			// you pass it an invalid array index value
		}

		// Code to access an array index will fail to compile if you don’t use a
		// char, byte, short, or int. The following lines don't compile:

		// cities[10d];
		// cities["one"];
		// cities[10L];
		System.out.println(cities[(int) 3L]);

		cities[0] = "N.Y.";
		System.out.println(cities[0]);

	}

	/**
	 * Test code
	 *
	 * @param args
	 */
	public static void main(final String[] args) {

		final ArrayBasics arrayBasics = new ArrayBasics();

		System.out.println("\n \n One Dimensional Arrays: ");
		arrayBasics.oneDimensionArrayBasics();

		System.out.println("\n \n Mult-Dimensional Arrays: ");
		arrayBasics.multidimensionalSymetricArrays();
		arrayBasics.multidimensionalAsymetricArrays();

		System.out.println("\n \n Accessing data: ");
		arrayBasics.accesingData();

		System.out.println("\n \n Default values: ");
		arrayBasics.defaultValues();
	}

}
