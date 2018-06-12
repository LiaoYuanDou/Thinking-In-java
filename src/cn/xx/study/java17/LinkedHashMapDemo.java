package cn.xx.study.java17;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		System.out.println(linkedHashMap);
		linkedHashMap = new LinkedHashMap<Integer, String>(16, 0.75f, true);
		for (int i = 0; i < 6; i++)
			linkedHashMap.get(i);
		System.out.println(linkedHashMap);
		linkedHashMap.get(0);
		System.out.println(linkedHashMap);
	}

}
