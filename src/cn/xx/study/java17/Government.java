package cn.xx.study.java17;

import cn.xx.study.java16.Generator;

public class Government implements Generator<String> {
	String[] foundation = ("strange women lying in ponds distributing swords is no basis for a system of government")
			.split(" ");
	private int index;

	@Override
	public String next() {
		return foundation[index++];
	}

}
