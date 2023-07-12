package lamda;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//		Stream<Integer> intStream = list.stream();
//		intStream.forEach(System.out::print);
////		intStream.forEach(System.out::print);//스트림은 1회용
//		String[] strArr = { "a", "b", "c", "d" };
//		Stream<String> strStream = Arrays.stream(strArr);
//		strStream.forEach(System.out::println);

		IntStream intStream2 = new Random().ints(); // 무한 스트림
		intStream2.limit(5).forEach(System.out::println);
		// 5개만 잘라서 출력

		Stream<Integer> intStream = Stream.iterate(1, n -> n + 2);
		intStream.limit(10).forEach(System.out::println);

		Stream<Integer> oneStream = Stream.generate(() -> 1);
		oneStream.limit(5).forEach(System.out::println);
	}
}
