package cn.xx.study.java15;

public class Holder<T> {
	private T a;

	public Holder(T a) {
		this.a = a;
	}
	
	public Holder() {
	}

	public void set(T a) {
		this.a = a;
	}

	public T get() {
		return a;
	}

	public static void main(String[] args) {
		Holder<Integer> holder = new Holder<Integer>(1);
		Integer a = holder.get();
		System.out.println(a);
	}
}
