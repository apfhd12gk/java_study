package chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Trader {
	private final String name;
	private final String city;

	public Trader(String n, String c) {
		this.name = n;
		this.city = c;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String toString() {
		return "Trader:" + this.name + " in " + this.city;
	}
}

class Transaction {
	private final Trader trader;
	private final int year;
	private final int value;

	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public int getYear() {
		return year;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return "{" + this.trader + ", " + "year:" + this.year + ", " + "value:" + this.value + "}";
	}
}

public class StreamTest {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

//		List<Transaction> ex1 = transactions.stream().filter(t -> t.getYear() == 2012)
//				.sorted(Comparator.comparing(Transaction::getValue)).collect(toList());
//		System.out.println(ex1);

//		List<String> ex2 = transactions.stream().map(t -> t.getTrader().getCity()).distinct().collect(toList());
//		System.out.println(ex2);

//		List<Trader> ex3 = transactions.stream().map(Transaction::getTrader)
//				.filter(trader -> trader.getCity() == "Cambridge").distinct()
//				.sorted(Comparator.comparing(Trader::getName)).collect(toList());
//		System.out.println(ex3);

//		String traderStr = transactions.stream().map(t -> t.getTrader().getName()).distinct().sorted().reduce("",
//				(a, b) -> a + b);
//		System.out.println(traderStr);

//		boolean milan = transactions.stream().anyMatch(t -> t.getTrader().getCity().equals("Milan"));
//		System.out.println(milan);

//		transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge")).map(Transaction::getValue)
//				.forEach(System.out::println);

		Optional<Integer> maxValue = transactions.stream().map(Transaction::getValue).reduce(Integer::min);
		System.out.println(maxValue);
	}

}
