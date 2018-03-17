package com.csb.algrithm.exchange;

import com.csb.algrithm.Sort;

/**
 * time complexity O(n^2), stability
 * 
 * @author chenshaobin Mar 17, 2018 1:59:40 PM
 *
 */
public class BubbleSort implements Sort {

	public void sort(Integer[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int a = array[i];
				int b = array[j];
				if (a > b) {
					array[i] = b;
					array[j] = a;
				}
			}
		}
	}
}
