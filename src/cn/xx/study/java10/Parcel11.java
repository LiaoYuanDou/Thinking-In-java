package cn.xx.study.java10;

public class Parcel11 {
	class Destination {
	}

	public Destination destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			{
				cost = Math.round(price);
				if (cost > 100) {
					System.out.println("Over budget!");
				}
			}
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {

		Parcel11 p = new Parcel11();
		Destination d = p.destination("Tasmania", 101.395F);
	}

}
