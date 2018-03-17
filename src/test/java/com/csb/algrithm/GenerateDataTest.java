package com.csb.algrithm;

import java.util.Arrays;

import org.junit.Test;

import com.csb.util.GenerateData;

public class GenerateDataTest {

	@Test
	public void randamArrayTest() {
		Integer[] array = GenerateData.randamArray(20, 100);
		System.out.println(Arrays.toString(array));
	}
}
