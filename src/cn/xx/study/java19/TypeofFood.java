package cn.xx.study.java19;

import cn.xx.study.java19.Food.Appetizer;
import cn.xx.study.java19.Food.Coffee;
import cn.xx.study.java19.Food.Dessert;
import cn.xx.study.java19.Food.MainCourse;

public class TypeofFood {

	public static void main(String[] args) {
		Food food = Appetizer.SALAD;
		food = MainCourse.LASAGNE;
		food = Dessert.GELATO;
		food = Coffee.CAPPUCCINO;
	}

}
