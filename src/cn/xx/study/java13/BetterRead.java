package cn.xx.study.java13;

import java.util.Scanner;

public class BetterRead {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.next();
		System.out.println(name);
		System.out.println("How old are you ? What is Your favorite double ?");
		System.out.println("(input: <age> <double>)");
		int age = scanner.nextInt();
		double favorite = scanner.nextDouble();
		System.out.println(age);
		System.out.println(favorite);
		System.out.format("Hi %s.\n", name);
		System.out.format("In 5 years you will be %d.\n", age + 5);
		System.out.format("My favorite double is %f.\n", favorite / 2);
	}

}
