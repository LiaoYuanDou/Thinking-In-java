package cn.xx.study.java7;

public class Circle extends Shape {

	Circle(int i) {
		super(i);
		System.out.println("Drawing Circle");
	}

	void dispose() {
		System.out.println("Erasiong Circle");
		super.dispose();
	}
}
