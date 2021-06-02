package matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchEle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		int cols = Integer.parseInt(br.readLine());
		int[][] mat = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			String[] temp = br.readLine().trim().split("\\s+");
			for (int j = 0; j < cols; j++)
				mat[i][j] = Integer.parseInt(temp[j]);
		}
		int x = Integer.parseInt(br.readLine());
		System.out.println(searchMatrix(mat, x));
		br.close();
	}

	private static boolean searchMatrix(int[][] matrix, int target) {
		for (int i = 0, j = matrix[0].length - 1; i < matrix.length && j >= 0;) {
			if (matrix[i][j] == target)
				return true;
			if (matrix[i][j] > target)
				j--;
			else
				i++;
		}
		return false;
	}

}
