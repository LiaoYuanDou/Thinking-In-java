package cn.xx.study.java14;

import java.util.Random;

public class ClassINitialization {
	public static Random rand = new Random(47);

	public static void main(String[] args) throws Exception {
		Class initable = Initable.class;
		System.out.println("After creating Initable ref");
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staticNonFinal);
		Class<?> initable3 = Class.forName("cn.xx.study.java14.Initable3");
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNonFinal);
	}

}
