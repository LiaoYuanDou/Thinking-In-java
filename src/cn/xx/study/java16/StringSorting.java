package cn.xx.study.java16;

import java.util.Arrays;
import java.util.Collections;

public class StringSorting {

	public static void main(String[] args) {
		String[] sa = new String[] { new RandomGenerator.String(5).next(), new RandomGenerator.String(5).next(),
				new RandomGenerator.String(5).next(), new RandomGenerator.String(5).next(),
				new RandomGenerator.String(5).next(), new RandomGenerator.String(5).next(),
				new RandomGenerator.String(5).next(), new RandomGenerator.String(5).next(),
				new RandomGenerator.String(5).next(), new RandomGenerator.String(5).next(),
				new RandomGenerator.String(5).next(), new RandomGenerator.String(5).next(),
				new RandomGenerator.String(5).next(), new RandomGenerator.String(5).next(),
				new RandomGenerator.String(5).next(), new RandomGenerator.String(5).next(),
				new RandomGenerator.String(5).next(), new RandomGenerator.String(5).next(),
				new RandomGenerator.String(5).next(), new RandomGenerator.String(5).next() };

		System.out.println("Before sort : " + Arrays.toString(sa));

		Arrays.sort(sa);
		System.out.println("After sort : " + Arrays.toString(sa));

		Arrays.sort(sa, Collections.reverseOrder());
		System.out.println("ReverseOrder sort : " + Arrays.toString(sa));

		Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
		System.out.println("case_insensitive_order sort : " + Arrays.toString(sa));
	}

}
