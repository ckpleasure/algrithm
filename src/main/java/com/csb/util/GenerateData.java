package com.csb.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
	 * sort by JDK Collections.sort
	 * 
	 * @author chenshaobin Mar 18, 2018 8:14:44 PM
	 *
	 * @param array
	 * @return
	 */
	public static Integer[] sort(Integer[] array) {
		Integer[] copy = new Integer[array.length];
		System.arraycopy(array, 0, copy, 0, array.length);
		List<Integer> list = Arrays.asList(copy);
		Collections.sort(list);
		copy = list.toArray(new Integer[] {});
		return copy;
	}
}
