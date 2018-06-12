package cn.xx.study.java11;

import java.util.Iterator;

public class NonCollectionSequence extends StringSequence {
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < strs.length;
			}

			@Override
			public String next() {
				return strs[index++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		Iterator<String> ncit = nc.iterator();
		while (ncit.hasNext())
			System.out.print(ncit.next());
	}
}
