package cn.xx.study.java11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOfInteger {

	public static void main(String[] args) {
		Random random1 = new Random(47);
		Set<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < 10000; i++)
			hashSet.add(random1.nextInt(50));
		System.out.println(hashSet);

		Random random2 = new Random(47);
		Set<Integer> treeSet = new TreeSet<Integer>();
		for (int i = 0; i < 10000; i++)
			treeSet.add(random2.nextInt(50));
		System.out.println(treeSet);

		TreeSet<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
	}

}
