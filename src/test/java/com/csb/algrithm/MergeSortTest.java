package com.csb.algrithm;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.csb.algrithm.MergeSort;
import com.csb.util.GenerateData;
import com.csb.util.SortHandle;

/**
 * @author chenshaobin Mar 20, 2018 8:14:55 PM
 *
 */
public class MergeSortTest {

	@Test
	public void sortTest() {
		Integer[] array = GenerateData.randamArray(10, 100);
		Integer[] expect = GenerateData.sort(array);

		SortHandle handle = new SortHandle(new MergeSort());
		handle.getProxy().sort(array);

		assertArrayEquals(expect, array);
	}
}
