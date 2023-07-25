package chapter11;

import java.util.Optional;

class Person {
	private Optional<Car> car;

	public Optional<Car> getCar() {
		return car;
	}
}

class Car {
	private Optional<Insurance> insurance;

	public Optional<Insurance> getInsurance() {
		return insurance;
	}
}

class Insurance {
	private String name;

	public String getName() {
		return name;
	}
}

public class OptionalTest {
	public static void main(String[] args) {
		String name = null;
		String str = Optional.ofNullable(name).orElse("NULL");

		System.out.println(str);
	}
}
