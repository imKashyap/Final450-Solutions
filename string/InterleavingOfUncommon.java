package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterleavingOfUncommon {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine().trim();
        String second = br.readLine().trim();
        String result = br.readLine().trim();
        if (first.length() + second.length() != result.length()) {
            System.out.println("false");
            return;
        }
        int i = 0, j = 0, k = 0;
        boolean isInterleaving = true;
        while (k < result.length()) {
            if (i < first.length() && result.charAt(k) == first.charAt(i))
                i++;
            else if (j < second.length() && result.charAt(k) == second.charAt(j))
                j++;
            else {
                isInterleaving = false;
                break;
            }
            k++;
        }
        if (isInterleaving)
            System.out.println("true");
        else
            System.out.println("false");
        br.close();
    }

}