package cn.xx.study.java15;

public class PlainGenericInheritance {

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		Apple apple = new Apple();
		DerivedG5 dgs = new DerivedG5();
		dgs.set(apple);
		dgs.set(fruit);
	}

}
