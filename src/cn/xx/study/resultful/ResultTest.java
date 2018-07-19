package cn.xx.study.resultful;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultTest {

	public static void main(String[] args) {

		// Result result = new Result();
		/*
		 * result.setResult_code(ResultCode.OK);
		 * 
		 * result.setResult_code(ResultCode.FAILY);
		 * System.out.println(ResultCode.OK);
		 * 
		 * // result.setResult_message("测试失败");
		 */
		Map<String, Object> map = new HashMap<String, Object>();

		List<User> list = new ArrayList<User>();

		User user = new User();
		user.setUserId(1);
		user.setUserName("xx");
		user.setUserType("1");
		list.add(user);
		map.put("userInfoList", list);
		// result.setResult_data(map);

		Result result = Result.setResult(0, list);
		System.out.println(result);

		Result result1 = Result.setResult(1, list);
		System.out.println(result1);

		Result result2 = Result.setResult(-1, list);
		System.out.println(result2);

		Result result3 = Result.setResult(3, "其他错误", list);
		System.out.println(result3);
		
		Result result4 = Result.setResult(0, "错误", list);
		System.out.println(result4);

	}

}
