package cn.xx.study.java15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ClassCasting {
	@SuppressWarnings({ "resource", "unchecked", "rawtypes", "unused" })
	public void f(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
		List<Holder> lw2 = List.class.cast(in.readObject());
	}
}
