package cn.xx.study.java8;

public class Description {
	private String s;

	public Description(String s) {
		this.s = s;
		System.out.println("Creating Description " + s);
	}

	protected void dispose() {
		System.out.println("Disposing Description " + s);
	}
}
