import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		String pattern = "^" + br.readLine().replace("*", ".*") + "$";
		String str = "";

		// System.out.println(pattern);
		for (int i = 0; i < T; i++) {
			str = br.readLine();

			if (str.matches(pattern)) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}

	}
}