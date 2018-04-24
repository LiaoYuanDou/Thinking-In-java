package cn.xx.study.java5;

public class NewVarArgs {

	static void printArray(Object... args) {
		for (Object object : args)
			System.out.print(object + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new Integer(47), new Float(3.14), new Double(11.11));
		printArray("one", "two", "three");
		printArray(new Table(), new Table(), new Table());
		printArray((Object[]) new Integer[] { 1, 2, 3, 4 });
		printArray();
	}

}
