package cn.xx.study.java17;

import java.util.ArrayList;

import cn.xx.study.java16.Generator;

public class CollectionData<T> extends ArrayList<T> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7590279301808304850L;

	public CollectionData(Generator<T> gen, int quantity) {
		for (int i = 0; i < quantity; i++)
			add(gen.next());
	}

	public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
		return new CollectionData<>(gen, quantity);
	}
}
