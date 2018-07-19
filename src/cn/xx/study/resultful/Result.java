package cn.xx.study.resultful;

import java.util.EnumSet;
import java.util.List;

public class Result {
	private int result_code;
	private String result_message;
	private Data result_data;

	public static Result setResult(int code, List<?> dataList) {

		Result result = new Result();

		EnumSet<ResultCode> enumSet = EnumSet.allOf(ResultCode.class);
		for (ResultCode recode : enumSet) {
			if (recode.getCode() == code) {
				result.setResult_message(recode.getMessage());
			}
		}
		result.setResult_code(code);

		Data data = new Data();
		data.setDataList(dataList);
		result.setResult_data(data);
		return result;

	}

	public static Result setResult(int code, List<?> dataList, int totalCount, int currentPage, int pageSize) {

		Result result = new Result();

		EnumSet<ResultCode> enumSet = EnumSet.allOf(ResultCode.class);
		for (ResultCode recode : enumSet) {
			if (recode.getCode() == code) {
				result.setResult_message(recode.getMessage());
			}
		}
		result.setResult_code(code);

		Data data = new Data();
		if (StringUtil.isHasEmpty(totalCount + "", currentPage + "", pageSize + "")) {
			return setResult(code, dataList);
		}
		data.setDataList(dataList);
		data.setCurrentPage(currentPage);
		data.setPageSize(pageSize);
		data.setTotalCount(totalCount);
		result.setResult_data(data);
		return result;

	}

	public static Result setResult(int result_code, String result_message, List<?> dataList, int totalCount,
			int currentPage, int pageSize) {
		Result result = new Result();
		result.setResult_message(result_message);

		result.setResult_code(result_code);

		Data data = new Data();
		data.setDataList(dataList);
		if (StringUtil.isHasEmpty(totalCount + "", currentPage + "", pageSize + "")) {
			return setResult(result_code, result_message, dataList);
		}
		data.setCurrentPage(currentPage);
		data.setPageSize(pageSize);
		data.setTotalCount(totalCount);
		result.setResult_data(data);
		return result;

	}

	public static Result setResult(int result_code, String result_message, List<?> dataList) {
		Result result = new Result();
		result.setResult_message(result_message);

		result.setResult_code(result_code);

		Data data = new Data();
		data.setDataList(dataList);

		result.setResult_data(data);
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

	public Data getResult_data() {
		return result_data;
	}

	public void setResult_data(Data result_data) {
		this.result_data = result_data;
	}

	@Override
	public String toString() {
		return "{ result_code : " + this.result_code + " result_message : " + this.result_message + " result_data : "
				+ this.result_data + " }";
	}
}
