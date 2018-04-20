package cn.xx.study.java4;

public class IfElse {
	static int result = 0;

	static void test(int testval, int target) {
		if (testval > target)
			result = +1;
		else if (testval < target)
			result = -1;
		else
			result = 0;
	}

	static int test1(int testval, int target) {
		if (testval > target)
			return +1;
		else if (testval < target)
			return -1;
		else
			return 0;
	}

	public static void main(String[] args) {
		test(10, 5);
		System.out.println(result);
		test(5, 10);
		System.out.println(result);
		test(5, 5);
		System.out.println(result);
		
		System.out.println();
		
		System.out.println(test1(10, 5));
		System.out.println(test1(5, 5));
		System.out.println(test1(5, 10));
	}

}
