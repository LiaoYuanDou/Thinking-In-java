package cn.xx.study.java15;

import java.util.ArrayList;

public class EtasedTypeEquivalence {

	public static void main(String[] args) {
		Class<? extends ArrayList> c1 = new ArrayList<Integer>().getClass();
		Class<? extends ArrayList> c2 = new ArrayList<String>().getClass();
		System.out.println(c1==c2);
	}

}
