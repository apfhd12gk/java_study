package chapter4;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

class Dish {
	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return name;
	}

	public enum Type {
		MEAT, FISH, OTHER
	}
}

public class Stream {
	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruite", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		List<String> threeHighCaloricDishNames = menu.stream() // menu에서 스트림을 얻는다
				.filter(dish -> dish.getCalories() > 300) // 고칼로리 요리 필터링
				.map(Dish::getName) // 요리명 추출
				.limit(3) // 선착순 세 개만 선택
				.collect(toList()); // 결과를 다른 리스트로 저장
		System.out.println(threeHighCaloricDishNames);
	}
}
