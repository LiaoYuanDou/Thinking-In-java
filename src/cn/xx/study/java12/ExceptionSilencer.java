package cn.xx.study.java12;

import javax.management.RuntimeErrorException;

public class ExceptionSilencer {

	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} finally {
			return;
		}
	}

}
