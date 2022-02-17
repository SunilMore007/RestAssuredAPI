package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Amar");
		map.put(2, "Sunil");
		map.put(3, "Ajit");
		map.put(4, "Pravin");

		map.remove("Sunil");
		System.out.print(map);

		System.out.println(map.entrySet());

		for (Map.Entry entry : map.entrySet()) {

			System.out.println("key is " + entry.getKey() + " value is " + entry.getValue());
		}

	}

}
