package cn.xx.study.resultful;

public enum ResultCode {
	RELOGIN(-1, "登录失效，请重新登录"), OK(0, "操作成功"), FAILY(1, "操作失败");

	private final int code;
	private final String message;

	private ResultCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	/*@Override
	public String toString() {
		return code + "";
	}*/

}
