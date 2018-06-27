package cn.xx.study.java18;

import java.io.Serializable;
import java.util.Date;

public class Logon implements Serializable {
	private Date date = new Date();
	private String username;
	private transient String password;

	private void logon(String name, String pwd) {
		username = name;
		password = pwd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
