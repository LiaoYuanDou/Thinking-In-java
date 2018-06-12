package cn.xx.study.java14;

public class Person {
	public final String first;
	public final String last;
	public final String adress;

	public Person(String first, String last, String adress) {
		this.first = first;
		this.last = last;
		this.adress = adress;
	}

	public String toString() {
		return "Person: " + first + " " + last + " " + adress;
	}

	public static class NullPerson extends Person {

		private NullPerson() {
			super("None", "None", "None");
		}

		public String toString() {
			return "NullPerson";
		}

	}

	public static final Person NULL = new NullPerson();
}
