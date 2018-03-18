package com.csb.algrithm.insert;

import com.csb.algrithm.Sort;

/**
 * time complexity O(n^2), stability
 * 
 * @author chenshaobin Mar 18, 2018 8:25:18 PM
 *
 */
public class StraightInsertionSort implements Sort {

	public void sort(Integer[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				int tmp = array[i];
				int k = i;
				for (int j = k - 1; j >= 0 && tmp < array[j]; j--) {
					array[j + 1] = array[j];
					k--;
				}
				array[k] = tmp;
			}
		}
	}
}
