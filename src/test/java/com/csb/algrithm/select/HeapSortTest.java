package com.csb.algrithm.select;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.csb.util.GenerateData;
import com.csb.util.SortHandle;

/**
 * @author chenshaobin Mar 18, 2018 6:27:32 PM
 *
 */
public class HeapSortTest {

	@Test
	public void sortTest() {
		Integer[] array = GenerateData.randamArray(10, 100);
		Integer[] expect = GenerateData.sort(array);

		SortHandle handle = new SortHandle(new HeapSort());
		handle.getProxy().sort(array);

		assertArrayEquals(expect, array);
	}

}
