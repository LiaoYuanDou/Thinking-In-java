package cn.xx.study.java10;

public class Parcel9 {
	class Destination {
	}

	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {

		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
	}

}
