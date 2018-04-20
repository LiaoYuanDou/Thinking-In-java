package cn.xx.study.java5;

public class SimpleConstructors {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Rock();
		}

		System.out.println();

 		for (int j = 0; j < 10; j++) {
			new Rock(j);
		}
	}

}
