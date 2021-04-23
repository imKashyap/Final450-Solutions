package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NegativePositive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String line = br.readLine();
		String[] temp = line.trim().split("\\s+");
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(temp[i]);
		int i = 0, j = 0;
		while (i < n) {
			if (arr[i] < 0) {
				if (i != j) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
				j++;
			}
			i++;
		}
		StringBuffer sb = new StringBuffer();
		for (i = 0; i < n; i++)
			sb.append(arr[i] + " ");
		System.out.print(sb);
		br.close();
	}

}

