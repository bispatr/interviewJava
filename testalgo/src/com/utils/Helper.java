package com.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Helper {

	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static int[] getIntArray() {
		int[] nums = { 34, 56, 76, 23, 45, 12, 35 };
		return nums;
	}

	public static void printArray(int[] elements) {
		for (int element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void log(String msg) {
		System.out.println(msg);
	}

	public static <E> void printHashMap(Map<E, E> elements) {
		for (Map.Entry<E, E> entry : elements.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

	}

	public static Set getSampleHashSetData() {
		Set set = new HashSet();
		set.add(23);
		set.add(45);
		set.add(34);
		set.add(56);
		set.add(26);
		return set;
	}

	public static Integer[] getArrayData() {
		Integer[] arr = { 34, 45, 26, 47, 87, 25 };
		return arr;
	}

	public static List getSampleArrayLIstData() {
		List set = new ArrayList();
		set.add(23);
		set.add(45);
		set.add(34);
		set.add(56);
		set.add(26);
		return set;
	}

	public static Map getSampleHashMapData() {
		Map map = new HashMap();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		return map;
	}
}
