package cn.xx.study.java10;

public class DotNew {
	public class Inner {
	}

	public static void main(String[] args) {
		DotNew dt = new DotNew();
		Inner dni = dt.new Inner();
	}

}
