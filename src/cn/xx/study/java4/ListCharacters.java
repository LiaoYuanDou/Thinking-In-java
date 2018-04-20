package cn.xx.study.java4;

public class ListCharacters {

	public static void main(String[] args) {
		for (char c = 0; c <= 128; c++) {
			if (Character.isLowerCase(c) || Character.isUpperCase(c)) {
				System.out.println("value: " + (int) c + " Character: " + c);
			}
		}

		for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
			System.out.println("i= " + i + " j= " + j);
		}
	}

}
