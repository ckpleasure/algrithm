package com.csb.algrithm.insert;

import java.util.Arrays;

import com.csb.algrithm.Sort;
import com.csb.util.GenerateData;

/**
 * time complexity O(n^1.3), instability
 * 
 * @author chenshaobin Mar 18, 2018 9:04:42 PM
 *
 */
public class ShellSort implements Sort {

	public void sort(Integer[] array) {

		for (int gap = array.length / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < array.length; i++) {
				int j = i;
				while (j - gap >= 0 && array[j] < array[j - gap]) {
					GenerateData.swap(array, j, j - gap);
					System.out.println(Arrays.toString(array));
					j -= gap;
				}
			}
		}
	}

}
