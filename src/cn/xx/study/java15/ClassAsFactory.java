package cn.xx.study.java15;

public class ClassAsFactory<T> {
	T x;

	public ClassAsFactory(Class<T> kind) {
		try {
			x = kind.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
