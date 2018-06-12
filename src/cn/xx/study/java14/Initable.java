package cn.xx.study.java14;

public class Initable {
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassINitialization.rand.nextInt(1000);
	static {
		System.out.println("Initializing initable");
	}
}
