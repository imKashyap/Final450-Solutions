package array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int len = scr.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++)
			arr[i] = scr.nextInt();
		display(reverseArray(arr, 0, len - 1));
		scr.close();
	}

	static int[] reverseArray(int arr[], int start, int end) {
		for (; start < end; start++, end--) {
			arr[start] = arr[start] * arr[end];
			arr[end] = arr[start] / arr[end];
			arr[start] = arr[start] / arr[end];
		}
		return arr;
	}

	static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
