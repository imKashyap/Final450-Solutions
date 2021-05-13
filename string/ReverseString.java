package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		int len = scr.nextInt();
		char[] arr = new char[len];
		for (int i = 0; i < len; i++)
			arr[i] = scr.next().charAt(0);
		reverseString(arr);
		display(arr);
		scr.close();
	}

	static void reverseString(char s[]) {
		for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
	}

	static void display(char[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
