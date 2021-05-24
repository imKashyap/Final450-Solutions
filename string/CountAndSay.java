package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountAndSay {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		if (n < 1) {
			System.out.println("");
			return;
		}
		String res = "1";
		while (n > 1) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < res.length(); i++) {
				int count = 1;
				while (i + 1 < res.length() && res.charAt(i) == res.charAt(i + 1)) {
					count++;
					i++;
				}
				sb.append(count).append(res.charAt(i));
			}
			res = sb.toString();
			n--;
		}
		System.out.println(res);
		br.close();
	}

}

