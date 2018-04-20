package cn.xx.study.java5;

public class Book {
	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	void checkIn(){
		checkedOut = false;
	}
	protected void finalize(){
		if(checkedOut){
			System.out.println("Error : checked out");
		}
	}
}
