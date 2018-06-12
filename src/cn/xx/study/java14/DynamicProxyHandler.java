package cn.xx.study.java14;

import java.lang.reflect.Method;

public class DynamicProxyHandler {
	private Object proxied;

	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("**** proxy: " + proxy.getClass() + " , method: " + method + " , agrs: " + args);
		if (args != null)
			for (Object object : args) {
				System.out.println(" " + object);

			}
		return method.invoke(proxied, args);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
