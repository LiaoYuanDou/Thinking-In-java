package cn.xx.study.java10;

public class Egg {
	private Yolk y;

	protected class Yolk {
		public Yolk() {
			System.out.println("Egg.Yolk()");
		}
	}

	public Egg() {
		System.out.println("New Egg()");
		y = new Yolk();
	}
}
