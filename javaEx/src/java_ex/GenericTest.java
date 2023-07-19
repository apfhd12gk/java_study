package java_ex;

import java.util.ArrayList;

class Product {
}

class Tv extends Product {
}

class Audio extends Product {
}

public class GenericTest {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
//		ArrayList<Product> tvList = new ArrayList<Tv>(); //에러 타입변수가 다름
//		List<Tv> tvList = new ArrayList<Tv>(); //제네릭 클래스끼리 다형성 ok

		productList.add(new Tv()); // product 자손들 ok
		productList.add(new Audio());

		tvList.add(new Tv());
		tvList.add(new Tv());
//		tvList.add(new Audio()); // x 제네릭 타입 또는 자손만 됨

		printAll(productList);
//		printAll(tvList); // printAll의 타입 리스트가 다름

	}

	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}
}
