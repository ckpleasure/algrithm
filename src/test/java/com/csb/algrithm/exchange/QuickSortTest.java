package com.csb.algrithm.exchange;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.csb.util.GenerateData;
import com.csb.util.SortHandle;

/**
 * @author chenshaobin Mar 17, 2018 9:06:16 PM
 *
 */
public class QuickSortTest {

	@Test
	public void sortTest() {
		Integer[] array = GenerateData.randamArray(10, 100);
		Integer[] expect = GenerateData.sort(array);

		SortHandle handle = new SortHandle(new QuickSort());
		handle.getProxy().sort(array);

		assertArrayEquals(expect, array);
	}
}
