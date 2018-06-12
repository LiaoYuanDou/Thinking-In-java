package cn.xx.study.java17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import cn.xx.study.java16.RandomGenerator;

public class CollectionDataTest {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(), 15));
		set.addAll(CollectionData.list(new Government(), 15));
		System.out.println(set);
		
		System.out.println(new ArrayList<String>(CollectionData.list(new RandomGenerator.String(9), 10)));
		
		System.out.println(new HashSet<Integer>(new CollectionData<>(new RandomGenerator.Integer(), 10)));
	}

}
