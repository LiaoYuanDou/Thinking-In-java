package cn.xx.study.java14;

public class SweetShop {

	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating Candy");

		try {
			Class.forName("cn.xx.study.java14.Gum");
			System.out.println("After Class.forName(\"Gum\")");
		} catch (ClassNotFoundException e) {
			System.out.println("could not find Gum");
		}

		new Cookie();
		System.out.println("After creating Cookie");
	}

}
