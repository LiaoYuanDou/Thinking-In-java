package cn.xx.study.java15;

public class CaptureConversion {
	static <T> void f1(Holder<T> holder) {
		T t = holder.get();
		System.out.println(t.getClass().getSimpleName());
	}

	static void f2(Holder<?> holder) {
		f1(holder);
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Holder<Integer> raw = new Holder<Integer>(1);
		f1(raw);
		f2(raw);

		@SuppressWarnings("rawtypes")
		Holder rawBasic = new Holder();
		rawBasic.set(new Object());
		f2(rawBasic);

		Holder<Double> wildcarded = new Holder<Double>(1.0);
		f2(wildcarded);
	}

}
