package java_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int check1 = 0;
		int check2 = 0;
		int[] a = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			a[i] = Integer.parseInt(br.readLine());
			sum += a[i];
		}
		Arrays.sort(a);
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - a[i] - a[j] == 100) {
					check1 = i;
					check2 = j;
				}
			}
		}
		System.out.println(check2);
		for (int i = 0; i < 9; i++) {
			if (i == check1 || i == check2) {
				continue;
			}
			System.out.println(a[i]);
		}
	}
}