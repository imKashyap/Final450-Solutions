package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SubarraySumZero {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String line = br.readLine();
		String[] temp = line.trim().split("\\s+");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(temp[i]);
		System.out.println(checkSum(arr, n));
		br.close();

	}

	static boolean checkSum(int arr[], int n) {
		Set<Integer> list = new HashSet<>();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum == 0)
				return true;
			boolean add = list.add(sum);
			if (!add)
				return true;
		}
		return false;
	}

}
