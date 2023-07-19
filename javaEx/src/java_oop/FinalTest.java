package java_oop;

public class FinalTest {
	public static void main(String[] args) {
		Card c = new Card("Heart", 10);
//		c.NUMBER=3;
		System.out.println(c.toString());
		c.addNumber(2);
		System.out.println(c.toString());
	}
}

class Card {
	private int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;

	Card(String kind, int number) {
		KIND = kind;
		NUMBER = number;
	}

	public void addNumber(int num) {
		NUMBER += num;
	}

	public String toString() {
		return KIND + " " + NUMBER;
	}
}
