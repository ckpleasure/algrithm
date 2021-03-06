package com.csb.algrithm.exchange;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.csb.util.GenerateData;
import com.csb.util.SortHandle;

public class BubbleSortTest {

	@Test
	public void sortTest() {
		Integer[] array = GenerateData.randamArray(10, 100);
		Integer[] expect = GenerateData.sort(array);

		SortHandle handle = new SortHandle(new BubbleSort());
		handle.getProxy().sort(array);

		assertArrayEquals(expect, array);
	}
}
