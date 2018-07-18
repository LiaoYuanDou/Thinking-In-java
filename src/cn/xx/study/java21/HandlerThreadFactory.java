package cn.xx.study.java21;

import java.util.concurrent.ThreadFactory;

public class HandlerThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		System.out.println(this + " creating new Thread");
		Thread t = new Thread(r);
		System.out.println("created " + t);
		t.setUncaughtExceptionHandler(new MyUncaughtExcepionHandler());
		System.out.println("eh = " + t.getUncaughtExceptionHandler());
		return t;
	}

}
