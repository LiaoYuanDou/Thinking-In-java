package cn.xx.study.java9;

public class Downcase extends Processor {
	String process(Object input) {
		return ((String) input).toLowerCase();
	}
}
