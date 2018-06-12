package cn.xx.study.java15;

public class OrdinaryArguments {

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		Apple apple = new Apple();
		DerivedSetter ds = new DerivedSetter();
		ds.set(apple);
		ds.set(fruit);
	}

}
