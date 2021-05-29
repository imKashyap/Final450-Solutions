package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrappingRainwater {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String line = br.readLine();
		String[] temp = line.trim().split("\\s+");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(temp[i]);
		int ans = trappingWater(arr, n);
		System.out.println(ans);
		br.close();

	}

	private static int trappingWater(int arr[], int n) {
		int[] a1 = new int[n];
		int[] a2 = new int[n];
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			max = arr[i] > max ? arr[i] : max;
			a1[i] = max;
		}
		max = arr[n - 1];
		for (int i = n - 1; i >= 0; i--) {
			max = arr[i] > max ? arr[i] : max;
			a2[i] = max;
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			int t = Math.min(a1[i], a2[i]) - arr[i];
			if (t > 0)
				count += t;
		}
		return count;
	}

}
