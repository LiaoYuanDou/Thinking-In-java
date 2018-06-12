package cn.xx.study.java15;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
	public static <T> List<T> makeList(T... args) {
		List<T> list = new ArrayList<T>();
		for (T t : args) {
			list.add(t);
		}
		return list;
	}

	public static void main(String[] args) {
		List<String> ls = makeList("A");
		System.out.println(ls);
		List<String> ls1 = makeList("A", "B", "C");
		System.out.println(ls1);
		List<String> ls3 = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
		System.out.println(ls3);
	}
}
