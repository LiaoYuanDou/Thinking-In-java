package cn.xx.study.java11;

import java.util.AbstractCollection;
import java.util.Iterator;

public class CollectionSequence extends AbstractCollection<Integer> {
	private Integer[] ints = { 1, 2, 3, 4, 5, 6, 7, 8 };

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < ints.length;
			}

			@Override
			public Integer next() {
				return ints[index++];
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}

		};
	}

	@Override
	public int size() {
		return ints.length;
	}

	public static void main(String[] args) {
		CollectionSequence c = new CollectionSequence();
		Iterator<Integer> cit = c.iterator();
		while (cit.hasNext())
			System.out.print(cit.next() + " ");

		System.out.println();

		for (Integer integer : c) {
			System.out.print(integer + " ");
		}
	}
}
