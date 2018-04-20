package cn.xx.study.java4;

public class BreakAndContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i == 74)
				break;
			if (i % 9 != 0)
				continue;
			System.out.print(" i = " + i);
		}

		System.out.println();

		int i = 0;
		while (true) {
			i++;
			int j = i * 27;
			if (j == 1269)
				break;
			if (i % 10 != 0)
				continue;
			System.out.print(" i = " + i);
		}

		System.out.println();
		for (int a = 0; a < 200; a++) {
			if (a == 100)
				break;
			if (a % 20 == 0) {
				System.out.println();
			}
			System.out.print(a + " ");
		}
	}
}
