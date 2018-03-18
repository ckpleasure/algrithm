package com.csb.algrithm.select;

import com.csb.algrithm.Sort;
import com.csb.util.GenerateData;

/**
 * time complexity O(nlogn), instability
 * 
 * @author chenshaobin Mar 18, 2018 2:34:48 AM
 *
 */
public class HeapSort implements Sort {

	public void sort(Integer[] array) {
		// the last non-leaf-node is n/2 -1
		for (int i = array.length / 2 - 1; i >= 0; i--) {
			adjustHeap(array, i, array.length);
		}

		for (int j = array.length - 1; j > 0; j--) {
			GenerateData.swap(array, 0, j);
			adjustHeap(array, 0, j);
		}
	}

	/**
	 * @author chenshaobin Mar 18, 2018 6:26:16 PM
	 *
	 * @param array
	 * @param i
	 * @param length
	 */
	public void adjustHeap(Integer[] array, int i, int length) {
		int tmp = array[i];
		for (int j = 2 * i + 1; j < length; j = j * 2 + 1) {
			if (j + 1 < length && array[j] < array[j + 1]) {
				j++;
			}
			if (array[j] > tmp) {
				array[i] = array[j];
				i = j;
			} else {
				break;
			}
		}
		array[i] = tmp;
	}
}
