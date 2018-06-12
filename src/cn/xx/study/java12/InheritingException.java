package cn.xx.study.java12;

public class InheritingException {
	public void f() throws SimpleException {
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}
	
	public static void main(String[] args) {
		InheritingException sed = new InheritingException();
		try {
			sed.f();
		} catch (SimpleException e) {
			System.out.println("Caught it!");
		}
	}
}
