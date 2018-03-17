package com.csb.algrithm.exchange;

import org.junit.Test;

import com.csb.util.GenerateData;
import com.csb.util.SortHandle;

public class BubbleSortTest {

	@Test
	public void sortTest() {
		Integer[] array = GenerateData.randamArray(10, 100);
		SortHandle handle = new SortHandle(new BubbleSort());
		handle.getProxy().sort(array);;
	}
}
