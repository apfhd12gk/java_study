package chapter2;

public class Behavior_Parameter2 {
	public static void main(String[] args) {
		Thread t = new Thread(() -> System.out.println("hello world"));
		t.run();
	}
}
