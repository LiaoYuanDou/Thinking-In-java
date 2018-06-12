package cn.xx.study.java14;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();

	private static String[] typeNames = { "cn.xx.study.java14.Pet", "cn.xx.study.java14.Pet" };

	@SuppressWarnings("unchecked")
	private static void loader() {
		try {
			for (String name : typeNames)
				types.add((Class<? extends Pet>) Class.forName(name));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException();
		}
	}

	static {
		loader();
	}

	@Override
	public List<Class<? extends Pet>> types() {
		return types;
	}

}
