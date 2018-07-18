package cn.xx.study.java19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class AtUnitExample {
	public String methodOne() {
		return "This is methodOne";
	}

	public int methodTwo() {
		System.out.println("This is methodTwo");
		return 2;
	}

	@Test
	void asserExample() {
		assert methodOne().equals("This is methodOne");
	}

	@Test
	void asserFailureExample() {
		assert 1 == 2 : "what a surprise";
	}

	@Test
	void exceptiionExample() throws IOException {
		new FileInputStream("notice.txt");
	}

	@Test
	boolean assertAndReturn() {
		assert methodTwo() == 2 : "methodTwo must equal 2";
		return methodOne().equals("This is methodOne");
	}
	
	public static void main(String[] args) {
		
	}
}
