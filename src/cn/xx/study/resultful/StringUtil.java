package cn.xx.study.resultful;

public class StringUtil {

	/**
	 * 判断String是否为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(final String str) {
		return ((str == null) || (str.length() == 0));
	}

	/**
	 * 判断String不为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(final String str) {
		return !isEmpty(str);
	}

	/**
	 * 判断String是否为空白
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isBlank(final String str) {
		int strLength;
		if ((str == null) || ((strLength = str.length()) == 0)) {
			return true;
		}
		for (int i = 0; i < strLength; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 判断String不为空白
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotBlank(final String str) {
		return !isBlank(str);
	}

	/**
	 * 判断多个字符串全部是否为空
	 * 
	 * @param strings
	 * @return
	 */
	public static boolean isAllEmpty(String... strings) {
		if (strings == null) {
			return true;
		}

		for (String str : strings) {
			if (isNotEmpty(str)) {
				return false;
			}
		}

		return true;
	}

	/**
	 * 判断多个字符串其中一个任意一个是否为空
	 * 
	 * @param strings
	 * @return
	 */
	public static boolean isHasEmpty(String... strings) {
		if (strings == null) {
			return true;
		}

		for (String str : strings) {
			if (isEmpty(str)) {
				return true;
			}
		}

		return false;
	}
	
	/**
	 * 判断字符串是不为空
	 * @param strings
	 * @return
	 */
	public static boolean isNotEmpty(String... strings) {
		if (strings == null) {
			return false;
		}

		for (String str : strings) {
			if (str == null || "".equals(str.trim())) {
				return false;
			}
		}

		return true;
	}
}
