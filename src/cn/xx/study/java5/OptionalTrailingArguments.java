package cn.xx.study.java5;

public class OptionalTrailingArguments {

	static void f(int required, String... strings) {
		System.out.print("required : " + required + " ");
		for (String string : strings) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1, "one");
		f(2, "two", "three");
		f(0);
	}

}
