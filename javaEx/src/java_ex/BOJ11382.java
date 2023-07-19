package java_ex;

import java.util.Scanner;

public class BOJ11382 {
	public static void main(String[] args) {
		long sum = 0;
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			sum += s.nextLong();
		}
		System.out.println(sum);
	}
}
