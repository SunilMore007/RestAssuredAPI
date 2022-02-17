package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Amar");
		map.put(2, "Sunil");
		map.put(3, "Ajit");
		map.put(4, "Pravin");

		System.out.print(map);

		Set set = map.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {

			Map.Entry enty = (Entry) itr.next();

			System.out.println("key is " + enty.getKey() + " and value is " + enty.getValue());

		}

	}

}
