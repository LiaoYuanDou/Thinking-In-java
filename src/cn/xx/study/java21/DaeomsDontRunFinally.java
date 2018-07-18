package cn.xx.study.java21;

public class DaeomsDontRunFinally {

	public static void main(String[] args) {
		Thread t = new Thread(new ADaemon());
		t.setDaemon(true);
		t.start();
	}

}
