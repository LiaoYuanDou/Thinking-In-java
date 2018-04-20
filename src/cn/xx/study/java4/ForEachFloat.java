package cn.xx.study.java4;

import java.util.Random;

public class ForEachFloat {

	public static void main(String[] args) {
		Random random = new Random(47);
		float f[] = new float[10];
		int[] b = new int[10];
		for (int i = 0; i < 10; i++) {
			b[i] = random.nextInt(100) + 1;
			f[i] = random.nextFloat();
		}
		for (float a : f)
			System.out.println("a = " + a);
		System.out.println();
		for (int i : b) {
			System.out.println("i = " + i);
		}
		System.out.println();
		for (char c : "xuxiao ai xiaodou ".toCharArray())
			System.out.print(c + " ");
	}

}
