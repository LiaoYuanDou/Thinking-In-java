package cn.xx.study.java8;

public class Brass extends Instrument {
	@Override
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
}
