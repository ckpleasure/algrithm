package com.csb.algrithm;

/**
 * time complexity O(nlogn), stability
 * 
 * @author chenshaobin Mar 18, 2018 11:36:07 PM
 *
 */
public class MergeSort implements Sort {

	public void sort(Integer[] array) {
		mergeSort(array, 0, array.length - 1);
	}

	private void mergeArray(Integer[] array, int first, int mid, int last) {
		Integer[] tmp = new Integer[array.length];
		int i = first;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= last) {
			if (array[i] <= array[j]) {
				tmp[k++] = array[i++];
			} else {
				tmp[k++] = array[j++];
			}
		}
		while (i <= mid) {
			tmp[k++] = array[i++];
		}
		while (j <= last) {
			tmp[k++] = array[j++];
		}
		for (i = 0; i < k; i++) {
			array[first + i] = tmp[i];
		}
	}

	private void mergeSort(Integer[] array, int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			mergeSort(array, first, mid);
			mergeSort(array, mid + 1, last);
			mergeArray(array, first, mid, last);
		}
	}
}
