package cn.xx.study.java6;

public class Detergent extends Cleanser {
	public void scrub() {
		append(" Detergent.scrub() ");
		super.scrub();
	}

	public void foam() {
		append(" foam() ");
	}

	public static void main(String[] args) {
		Detergent d = new Detergent();
		d.dilute();
		d.apply();
		d.scrub();
		d.foam();
		System.out.println(d);
		System.out.println("Testing base class : ");
		Cleanser.main(args);
	}

}
