package cn.xx.study.java11;

import java.util.Iterator;

public class InterableCLass implements Iterable<String> {
	protected String[] words = ("And that is how " + "we know the Earth th be banana-shaped.").split(" ");

	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < words.length;
			}

			@Override
			public String next() {
				return words[index++];
			}

		};
	}

	public static void main(String[] args) {
		for (String s : new InterableCLass()) {
			System.out.print(s + " ");
		}
	}

}
