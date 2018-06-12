package cn.xx.study.java15;

public class GenericCast {
	public static final int SIZE = 10;

	public static void main(String[] args) {
		FixedSizeStack<String> stack = new FixedSizeStack<String>(SIZE);
		for (String s : "A B C D E F G H I J".split(" "))
			stack.push(s);
		for (int i = 0; i < SIZE; i++) {
			String s = stack.pop();
			System.out.print(s + " ");
		}
	}

}
