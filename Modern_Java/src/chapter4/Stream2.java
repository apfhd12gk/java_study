package chapter4;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class Stream2 {
	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruite", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

//		List<Dish> vegetarianDishes = new ArrayList<>();
//		for (Dish d : menu) {
//			if (d.isVegetarian()) {
//				vegetarianDishes.add(d);
//			}
//		} // 스트림 사용하기 전

		List<Dish> vegetarianDishes = menu.stream().filter(Dish::isVegetarian)// 채식인지 필터링
				.collect(toList());
		// 스트림 사용
		System.out.println(vegetarianDishes);

//		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
//		numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);

//		List<Dish> meatDishes = menu.stream().filter(d -> d.getType() == Dish.Type.MEAT).limit(2).collect(toList());
//		System.out.println(meatDishes);

		List<Integer> dishNameLengths = menu.stream().map(Dish::getName).map(String::length).collect(toList());
		System.out.println(dishNameLengths);
	}
}
