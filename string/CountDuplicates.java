package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDuplicates {

	static final int NO_OF_CHARS = 256;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		printDups(str);

	}

	static void fillCharCounts(String str, int[] count) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}

	static void printDups(String str) {
		int count[] = new int[NO_OF_CHARS];
		fillCharCounts(str, count);

		for (int i = 0; i < NO_OF_CHARS; i++)
			if (count[i] > 1)
				System.out.println((char) (i) + ": " + count[i]);
	}
}

