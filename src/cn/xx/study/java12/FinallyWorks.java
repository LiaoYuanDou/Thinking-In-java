package cn.xx.study.java12;

public class FinallyWorks {
	static int count = 0;

	public static void main(String[] args) {
		while (true) {
			try {
				if (count++ == 0)
					throw new DynamicFieldsException();

				System.out.println("No exception");
			} catch (DynamicFieldsException e) {
				System.out.println("DynamicFieldsException");
			} finally {
				System.out.println("In finally clause");
				if (count == 2)
					break;
			}
		}
	}
}
