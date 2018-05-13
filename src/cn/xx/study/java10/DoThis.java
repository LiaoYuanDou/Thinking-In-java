package cn.xx.study.java10;

public class DoThis {
	void f() {
		System.out.println("DOThis.f()");
	}

	public class Inner {
		public DoThis outer() {
			return DoThis.this;
		}
	}

	public Inner inner() {
		return new Inner();
	}

	public static void main(String[] args) {
		DoThis dt = new DoThis();
		DoThis.Inner dti = dt.inner();
		dti.outer().f();

	}

}
