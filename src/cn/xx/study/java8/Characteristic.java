package cn.xx.study.java8;

public class Characteristic {
	private String s;

	public Characteristic(String s) {
		this.s = s;
		System.out.println("Creating Characteristic " + s);
	}

	protected void dispose() {
		System.out.println("Disposing Characteristic " + s);
	}

}
