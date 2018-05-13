package cn.xx.study.java9;

public class Upcase extends Processor {
	String process(Object input) {
		return ((String) input).toUpperCase();
	}
}
