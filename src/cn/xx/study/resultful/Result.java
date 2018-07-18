package cn.xx.study.resultful;

import java.util.EnumSet;
import java.util.Map;

public class Result {
	private int result_code;
	private String result_message;
	private Map<String, Object> result_data;

	public static Result setResult(int code, Map<String, Object> data) {

		Result result = new Result();

		EnumSet<ResultCode> enumSet = EnumSet.allOf(ResultCode.class);
		for (ResultCode recode : enumSet) {
			if (recode.getCode() == code) {
				result.setResult_message(recode.getMessage());
			}
		}
		result.setResult_code(code);
		result.setResult_data(data);
		return result;

	}

	public static Result setResult(int result_code, String result_message, Map<String, Object> result_data) {
		Result result = new Result();
		result.setResult_message(result_message);

		result.setResult_code(result_code);
		result.setResult_data(result_data);
		return result;

	}

	public int getResult_code() {
		return result_code;
	}

	public void setResult_code(int result_code) {
		this.result_code = result_code;
	}

	public String getResult_message() {
		return result_message;
	}

	public void setResult_message(String result_message) {
		this.result_message = result_message;
	}

	public Map<String, Object> getResult_data() {
		return result_data;
	}

	public void setResult_data(Map<String, Object> result_data) {
		this.result_data = result_data;
	}

	@Override
	public String toString() {
		return "{ result_code : " + this.result_code + " result_message : " + this.result_message + " result_data : "
				+ this.result_data + " }";
	}
}
