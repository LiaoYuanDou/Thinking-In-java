package cn.xx.study.java21;

public class SimpleThread extends Thread {
	private int countDown = 5;
	private static int threadCount = 0;

	public SimpleThread() {
		super(Integer.toString(++threadCount));
		start();

	}

	public SimpleThread(Runnable target) {
		super(target);
	}

	public SimpleThread(String name) {
		super(name);
	}

	public SimpleThread(ThreadGroup group, Runnable target) {
		super(group, target);
	}

	public SimpleThread(ThreadGroup group, String name) {
		super(group, name);
	}

	public SimpleThread(Runnable target, String name) {
		super(target, name);
	}

	public SimpleThread(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
	}

	public SimpleThread(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
	}

	@Override
	public String toString() {
		return "# " + getName() + " ( " + countDown + " ) ,";
	}

	@Override
	public void run() {
		while (true) {
			System.out.println(this);
			if (--countDown == 0)
				return;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			new SimpleThread();
	}

}
