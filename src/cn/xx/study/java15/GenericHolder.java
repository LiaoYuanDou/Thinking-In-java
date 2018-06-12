package cn.xx.study.java15;

public class GenericHolder<T> {
	private T obj;

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}

	public static void main(String[] args) {
		GenericHolder<String> gh = new GenericHolder<String>();
		gh.set("Item");
		System.out.println(gh.get());
	}

}
