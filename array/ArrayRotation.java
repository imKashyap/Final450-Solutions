package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long[] arr = new long[(int) n];
		String line = br.readLine();
		String[] temp = line.trim().split("\\s+");
		for (int i = 0; i < n; i++)
			arr[i] = Long.parseLong(temp[i]);
		int k = Integer.parseInt(br.readLine());
		k = k % (int) n;
		long[] rotated = new long[(int) n];
		for (int i = 0, j = i + k; i < n; i++, j++) {
			rotated[j] = arr[i];
			if (j == n - 1)
				j = -1;
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++)
			sb.append(rotated[i] + " ");
		System.out.print(sb);
		br.close();
	}
}
