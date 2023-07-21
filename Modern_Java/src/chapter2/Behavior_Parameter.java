package chapter2;

import java.util.ArrayList;
import java.util.List;

public interface ApplePredicate {
	boolean test(Apple apple);
	// 다른 조건의 사과를 필터하는 요구사항이 생기면 인터페이스를 상속받아 새로운 클래스를 짜기만 하면 된다.
	// 동작을 파라미터화
}

public class AppleHeavyWeightPredicate implements ApplePredicate {
	public boolean test(Apple apple) {
		return apple.getWeight() > 150;
	}
}

public class AppleGreenColorPredicate implements ApplePredicate {
	public boolean test(Apple apple) {
		return GREEN.equal(apple.getColor());
	}
}

public class Behavior_Parameter {
	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	List<Apple> result = filterApples(inventory, (Apple) -> RED.equal(apple.getColor()));
	// 람다표현식으로 간결하면서 동작설명까지 확인 가능
	// 새로운 요구사항이 생길때 마다 클래스 추가할 필요 없음
}
