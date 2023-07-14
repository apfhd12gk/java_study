package lamda;

import java.util.Optional;

public class OptionalTest2 {
	public static void main(String[] args) {
		int result1 = Optional.of("123").filter(x -> x.length() > 0).map(s -> Integer.parseInt(s)).get();

		System.out.println("result1: " + result1);

		int result2 = Optional.of("").filter(x -> x.length() > 0).map(s -> Integer.parseInt(s)).orElse(-1);
		System.out.println("result2: " + result2);
	}
}
