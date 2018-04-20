package cn.xx.study.java3;

public class AllOps {
	
	void f(boolean b){}
	
	void charTest(char x,char y){
		x = (char)(x*y);
	}
	
	public static void main(String[] args) {
		int big = Integer.MAX_VALUE;
		System.out.println("big = " + big);
		int bigger = big * 4;
		System.out.println("bigger = " + bigger);
	}
}
