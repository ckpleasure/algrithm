package com.csb.algrithm.exchange;

import com.csb.algrithm.Sort;

/**
 * time complexity O(nlogn), instability
 * 
 * @author chenshaobin Mar 17, 2018 3:33:16 PM
 *
 */
public class QuickSort implements Sort {

	public void sort(Integer[] array) {
		int left = 0;
		int right = array.length - 1;
		quickSort(array, left, right);
	}

	private void quickSort(Integer[] array, int _left, int _right) {
		int left = _left;
		int right = _right;
		if (left <= right) {
			int tmp = array[left];
			while (left != right) {
				while (right > left && array[right] >= tmp) {
					right--;
				}
				array[left] = array[right];
				while (left < right && array[left] <= tmp) {
					left++;
				}
				array[right] = array[left];
			}

			array[right] = tmp;
			quickSort(array, _left, left - 1);
			quickSort(array, right + 1, _right);
		}
	}
}
