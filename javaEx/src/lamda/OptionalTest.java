package lamda;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
//		int[] arr = null;
		int[] arr = new int[0];
		System.out.println("arr.length=" + arr.length);

//		Optional<String> opt = null; //OK 하지만 바라직x
		Optional<String> opt = Optional.empty();
		System.out.println("opt=" + opt);

		String str = "";

//		str = opt.orElse("EMPTY");
		str = opt.orElseGet(String::new);// (()->new String())
		System.out.println("str:" + str);
	}
}
