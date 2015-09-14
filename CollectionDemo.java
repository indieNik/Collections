package com.psl.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Nik");
		arr.add("Ritesh");

//		System.out.println(arr); // not desired format!

		Iterator<String> it = arr.iterator();
		while (it.hasNext()) {
//			System.out.println(it.next());
		}

		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(1, "Nik");
		map.put(2, "Ritesh");
		//System.out.println(map);

		//System.out.println(map.get(2));

		Iterator<Integer> itr = map.keySet().iterator();
		System.out.println("sts");
		while (itr.hasNext()) {
			System.out.println("Start");
			System.out.println(map.get(itr.next()));
		}
	}
}
