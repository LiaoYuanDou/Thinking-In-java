package cn.xx.study.java21;

import java.lang.Thread.UncaughtExceptionHandler;

public class MyUncaughtExcepionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("caught " + e);
	}

}
