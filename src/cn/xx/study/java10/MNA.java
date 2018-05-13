package cn.xx.study.java10;

import cn.xx.study.java10.MNA.A.B;

public class MNA {
	private void f() {
		System.out.println("MNA.f()");
	}

	class A {
		private void g() {
			System.out.println("A.g()");
		}

		class B {
			void h() {
				System.out.println("B.h()");
				g();
				f();
			}
		}
	}

	public static void main(String[] args) {
		MNA mna = new MNA();
		A mnaa = mna.new A();
		B mnaab = mnaa.new B();
		mnaab.h();
	}
}
