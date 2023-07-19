package java_ex;

import java.util.ArrayList;

class Fruit2 	{public String toString() {return "Fruit";}}
class Apple2 extends Fruit2	{public String toString() {return "Apple";}}
class Grape2 extends Fruit2	{public String toString() {return "Grape";}}

class Juice {
	String name;
	Juice(String name) {this.name = name + "Juice";}
	public String toString() {return name;}
}
class Juicer {
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
		String tmp ="";
		
		for(Fruit2 f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

public class GenericTest4 {

	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<>();
		FruitBox2<Apple2> appleBox = new FruitBox2<>();
		FruitBox2<Grape2> grapeBox = new FruitBox2<>();
//		FruitBox<Toy> toyBox = new FruitBox<>();//에러 Eatable인터페이스를 갖거나 Fruit를 상속받아야함
		
		fruitBox.add(new Fruit2());
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
//		appleBox.add(new Grape2()); //에러 appleBox는 Apple 또는 Apple 자손만 가능
		grapeBox.add(new Grape2());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		
	}

}
class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	ArrayList<T> getList() {return list;}
	int size() {return list.size();}
	public String toString() { return list.toString();}
}