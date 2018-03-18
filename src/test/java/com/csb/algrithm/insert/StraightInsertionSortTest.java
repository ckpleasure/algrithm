package com.csb.algrithm.insert;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.csb.util.GenerateData;
import com.csb.util.SortHandle;

/**
 * @author chenshaobin Mar 18, 2018 8:31:08 PM
 *
 */
public class StraightInsertionSortTest {

	@Test
	public void sortTest() {
		Integer[] array = GenerateData.randamArray(10, 100);
		Integer[] expect = GenerateData.sort(array);
		
		SortHandle handle = new SortHandle(new StraightInsertionSort());
		handle.getProxy().sort(array);
		
		assertArrayEquals(expect, array);
	}
}
