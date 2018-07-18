package cn.xx.study.java19;

public class UpcastEnum {

	public static void main(String[] args) {
		Explore[] vals = Explore.values();
		Enum e = Explore.HERE;
		for (Enum en : e.getClass().getEnumConstants())
			System.out.println(en);
	}

}
