package cn.xx.study.java15;

import java.util.ArrayList;

public class TupleList<A, B, C, D> extends ArrayList {

	public static void main(String[] args) {
		TupleList<Integer, Long, Float, Double> t = new TupleList<Integer,Long,Float,Double>();
		t.add("");
	}

}
