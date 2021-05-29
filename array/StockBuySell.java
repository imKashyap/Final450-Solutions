package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StockBuySell {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String line = br.readLine();
		String[] temp = line.trim().split("\\s+");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(temp[i]);
		int ans = maxProfit(arr);
		System.out.println(ans);
		br.close();
	}

	private static int maxProfit(int[] arr) {
		int max = 0, min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int t = arr[i] - min;
			if (t > max)
				max = t;
			if (arr[i] < min)
				min = arr[i];
		}
		return max;
	}

}
