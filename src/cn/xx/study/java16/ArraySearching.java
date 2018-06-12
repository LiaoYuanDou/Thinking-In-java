package cn.xx.study.java16;

import java.util.Arrays;

public class ArraySearching {

	public static void main(String[] args) {
		Generator<Integer> gen = new RandomGenerator.Integer(1000);
		Integer[] a = new Integer[] { gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(),
				gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(),
				gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(), gen.next(),
				gen.next(), gen.next(), gen.next() };

		Arrays.sort(a);
		System.out.println("sorted array : " + Arrays.toString(a));

		while (true) {
			int r = gen.next();
			int location = Arrays.binarySearch(a, r);
			if (location >= 0) {
				System.out.println("Location of " + r + " is " + location + " , a[" + location + "] = " + a[location]);
				break;
			}
		}
	}

}
