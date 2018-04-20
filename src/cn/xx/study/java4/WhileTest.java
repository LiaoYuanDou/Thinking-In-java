package cn.xx.study.java4;

public class WhileTest {
	static boolean condition() {
		double random = Math.random();
		boolean result = random < 0.99;
		System.out.println(random);
		System.out.println(result + "");
		return result;
	}

	public static void main(String[] args) {
		while (condition()) {
			System.out.println("Inside 'while' ");
			System.out.println("Exited 'while' ");
		}
	}

}
