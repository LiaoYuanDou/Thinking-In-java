package cn.xx.study.java15;

public class InstantiateGenericType {

	public static void main(String[] args) {
		ClassAsFactory<Building> fb = new ClassAsFactory<Building>(Building.class);
		System.out.println("ClassAsFactory<Building> succeeed");
		try {
			ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
		} catch (Exception e) {
			System.out.println("ClassAsFactory<Building> failed");
		}
	}

}
