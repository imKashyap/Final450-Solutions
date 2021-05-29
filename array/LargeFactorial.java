package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LargeFactorial {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> ans = getFact(n);
		for (int a : ans)
			System.out.print(a);
		br.close();
	}

	private static List<Integer> getFact(int n) {
		List<Integer> ans = new ArrayList<>();
		ans.add(1);
		for (int i = 2; i <= n; i++)
			multiply(ans, i);
		return ans;
	}

	private static void multiply(List<Integer> a, int n) {
		int carry = 0;
		for (int i = a.size() - 1; i >= 0; i--) {
			int pro = n * a.get(i) + carry;
			int val = pro % 10;
			a.set(i, val);
			carry = pro / 10;
		}
		while (carry != 0) {
			a.add(0, carry % 10);
			carry /= 10;
		}
	}

}
