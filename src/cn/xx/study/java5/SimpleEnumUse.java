package cn.xx.study.java5;

public class SimpleEnumUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spiciness medium = Spiciness.MEDIUM;
		System.out.println(medium);
		for (Spiciness s : Spiciness.values())
			System.out.println(s + " , ordinal " + s.ordinal());

	}

}
