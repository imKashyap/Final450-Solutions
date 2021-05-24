package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreRotations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine().trim();
		String s2 = br.readLine().trim();
		System.out.println((s1 + s1).contains(s2));
		br.close();
	}

}

