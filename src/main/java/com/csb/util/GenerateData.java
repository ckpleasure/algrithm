package com.csb.util;

import java.util.Random;

/**
 * @author chenshaobin Mar 17, 2018 2:00:41 PM
 *
 */
public class GenerateData {

	/**
	 * generate random array data
	 * 
	 * @author chenshaobin Mar 17, 2018 2:14:53 PM
	 *
	 * @param length
	 * @param bound
	 * @return
	 */
	public static Integer[] randamArray(int length, int bound) {
		Integer[] array = new Integer[length];

		for (int i = 0; i < length; i++) {
			int value = new Random().nextInt(bound);
			array[i] = value;
		}
		return array;
	}

	/**
	 * print array
	 * 
	 * @author chenshaobin Mar 17, 2018 2:28:10 PM
	 *
	 * @param array
	 */
	public static void printArray(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i > 0 && i < array.length) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

}
