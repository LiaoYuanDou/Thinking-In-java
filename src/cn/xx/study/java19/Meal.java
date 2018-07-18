package cn.xx.study.java19;

import java.util.Random;

public enum Meal {
	APPETIZER(Food.Appetizer.class), MAINCOURSE(Food.MainCourse.class), DESSERT(Food.Dessert.class), COFFEE(
			Food.Coffee.class);

	private Food[] values;

	private Meal(Class<? extends Food> kind) {
		values = kind.getEnumConstants();
	}

	public interface Food {
		enum Appetizer implements Food {
			SALAD, SOUP, SPRING_ROLLS;
		}

		enum MainCourse implements Food {
			LASAGNE, BURRITO, PAD_THAI, LENTILS, HUMMOUS, VINDALOO;
		}

		enum Dessert implements Food {
			TIRAMISU, GELATO, BLACK_FOREST_CAKE, FRUIT, CREME_CARAMEL;
		}

		enum Coffee implements Food {
			BLACK_COFFEE, DECAF_COFFEE, ESPRESSO, LATTE, CAPPUCCINO, TEA, HERB_TEA;
		}
	}

	Random rand = new Random(47);

	public Food randomSelection() {
		return values[rand.nextInt(values.length)];
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (Meal meal : Meal.values()) {
				Food food = meal.randomSelection();
				System.out.println(food);

			}
			System.out.println("-------------");
		}
	}
}
