package com.csb.algrithm.select;

import com.csb.algrithm.Sort;

/**
 * time complexity O(n^2), instability
 * 
 * @author chenshaobin Mar 18, 2018 1:34:03 AM
 *
 */
public class StraightSelectionSort implements Sort {

	public void sort(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			int tmp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = tmp;
		}
	}

}
