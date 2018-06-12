package cn.xx.study.java15;

import java.util.Random;

public class Product {
	private final int id;
	private final String description;
	private double price;

	public Product(int ID, String des, double price) {
		id = ID;
		description = des;
		this.price = price;
		System.out.println(toString());
	}

	public String toString() {
		return id + ": " + description + " , price : $" + price;
	}

	public void priceChange(double change) {
		price += change;
	}

	public static Generator<Product> generator = new Generator<Product>(){
		private Random random = new Random(47);
		public Product next(){
			return new Product(random.nextInt(1000), "Test", Math.round(random.nextDouble()*1000.0)+0.99);
		}
	};
}
