package cn.xx.study.java15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedList {
	@SuppressWarnings("unchecked")
	static void oldStyleMethod(List pro) {
		pro.add(new String());
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		oldStyleMethod(list1);
		List<Integer> list2 = Collections.checkedList(new ArrayList<Integer>(), Integer.class);
		try {
			oldStyleMethod(list2);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
