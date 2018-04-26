package cn.xx.study.java6;

public class ChocolateChip extends Cookie {
	
	public ChocolateChip(){
		System.out.println("ChocolateChip constructor");
	}
	
	public void chmop(){
		bite();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateChip c = new ChocolateChip();
		c.chmop();
	}

}
