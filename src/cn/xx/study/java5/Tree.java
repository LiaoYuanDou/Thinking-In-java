package cn.xx.study.java5;

public class Tree {

	int height;

	Tree() {
		System.out.println("Plating a seeding");
		height = 0;
	}

	Tree(int height) {
		this.height = height;
		System.out.println("Creating new Tree that is " + height + " feet tall");
	}

	void info() {
		System.out.println("Tree is " + height + " feet tall");
	}

	void info(String s) {
		System.out.println(s + ":Tree is " + height + " feet tall");
	}
}
