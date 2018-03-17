package com.csb.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.csb.algrithm.Sort;

/**
 * dynamic proxy to print array data
 * 
 * @author chenshaobin Mar 17, 2018 3:42:22 PM
 *
 */
public class SortHandle implements InvocationHandler {

	private Sort target;

	public SortHandle(Sort target) {
		super();
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Integer[] array = (Integer[]) args[0];

		System.out.println("array before bubble sort:");
		GenerateData.printArray(array);

		Object result = method.invoke(target, args);

		System.out.println("array before after sort:");
		GenerateData.printArray(array);
		return result;
	}

	public Sort getProxy() {
		return (Sort) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
				target.getClass().getInterfaces(), this);
	}
}
