package cn.xx.study.java5;

public class Overloading {

	static void f(String s, int i) {
		System.out.println("String : " + s + " , int : " + i);
	}

	static void f(int i, String s) {
		System.out.println("int : " + i + " , String : " + s);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Tree tree = new Tree(i);
			tree.info();
			tree.info("overloading method");
		}
		new Tree();

		f("String first", 11);
		f(99, "int first");
	}

}
