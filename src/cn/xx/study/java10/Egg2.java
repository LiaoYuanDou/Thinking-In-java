package cn.xx.study.java10;

public class Egg2 {
	private Yolk y = new Yolk();

	protected class Yolk {
		public Yolk() {
			System.out.println("Egg2.Yolk()");
		}

		public void f() {
			System.out.println("Egg2.Yolk.f()");
		}
	}

	public Egg2() {
		System.out.println("New Egg2()");
	}

	public void insertYolk(Yolk yy) {
		y = yy;
	}

	public void g() {
		y.f();
	}

}
