package cn.xx.study.java11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Statistics {

	public static void main(String[] args) {
		Random rand = new Random(47);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < 10000; i++) {
			int r = rand.nextInt(20);
			Integer count = map.get(r);
			map.put(r, count == null ? 1 : ++count);
		}
		System.out.println(map);
		Set<Integer> keySet = map.keySet();
		Collection<Integer> values = map.values();
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		System.out.println(keySet);
		System.out.println(values);
		Iterator<Entry<Integer, Integer>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		Object[] array = entrySet.toArray();
		System.out.println(array.toString());
	}

}
