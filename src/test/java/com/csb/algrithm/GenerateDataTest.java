package com.csb.algrithm;

import org.junit.Test;

import com.csb.util.GenerateData;

public class GenerateDataTest {

	@Test
	public void randamArrayTest() {
		Integer[] array = GenerateData.randamArray(20, 100);
		GenerateData.printArray(array);
	}
}
