package cn.xx.study.java14;

public class ToyTest {
	static void printInfo(Class cc) {
		System.out.println("Class name: " + cc.getName());
		System.out.println("Class SimpleName: " + cc.getSimpleName());
		System.out.println("Class CanonicalName: " + cc.getCanonicalName());
	}

	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("cn.xx.study.java14.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch (InstantiationException e) {
			System.out.println("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}

}
