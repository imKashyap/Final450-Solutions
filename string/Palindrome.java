package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().trim();
		boolean pal = true;
		for (int start = 0, end = s.length() - 1; start < end; start++, end--) {
			if (s.charAt(start) != s.charAt(end)) {
				pal = false;
				break;
			}
		}
		System.out.print(pal);
		br.close();
	}
}

