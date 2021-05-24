package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String line = br.readLine();
		String[] temp = line.trim().split("\\s+");
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(temp[i]);
		int c0 = 0, c1 = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0)
				c0++;
			else if (arr[i] == 1)
				c1++;
		}
		for (int i = 0; i < n; i++) {
			if (c0 > 0) {
				arr[i] = 0;
				c0--;
			} else if (c1 > 0) {
				arr[i] = 1;
				c1--;
			} else
				arr[i] = 2;
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++)
			sb.append(arr[i] + " ");
		System.out.print(sb);
		br.close();

	}

}

