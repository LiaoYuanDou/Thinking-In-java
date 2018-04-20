package cn.xx.study.java4;

import java.util.Random;

public class VowelsAndConsonants {

	public static void main(String[] args) {

		Random random = new Random(47);

		for (int i = 0; i < 100; i++) {
			int c = random.nextInt(26) + 'a';
			System.out.println((char) c + ", " + c + ": ");

			switch (c) {
			case 'a':
				System.out.println("no break");
			case 'e':
				System.out.println("no break");
			case 'i':
				System.out.println("break");
				break;
			case 'o':
			case 'u':
				System.out.println("vowel");
				break;
			case 'y':
			case 'w':
				System.out.println("Sometimes a vowel");
				break;
			default:
				System.out.println("consonant");
			}

		}
	}
}
