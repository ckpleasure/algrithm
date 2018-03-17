package com.csb.algrithm.select;

import org.junit.Test;

import com.csb.util.GenerateData;
import com.csb.util.SortHandle;

/**
 * time complexity O(n^2), instability
 * 
 * @author chenshaobin Mar 18, 2018 2:07:38 AM
 *
 */
public class StraightSelectionSortTest {

	@Test
	public void sortTest() {
		Integer[] array = GenerateData.randamArray(10, 100);
		SortHandle handle = new SortHandle(new StraightSelectionSort());
		handle.getProxy().sort(array);
	}
}
