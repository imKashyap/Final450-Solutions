package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp= br.readLine().trim().split("\\s+");
        int a= Integer.parseInt(temp[0]);
        int b= Integer.parseInt(temp[1]);
        System.out.println(countBitsFlip(a,b));
    }

    private static int countBitsFlip(int a, int b){
        int ans= a^b;
        int count=0;
        while(ans!=0){
            count++;
            ans= ans& ans-1;
        }
        return count;
    }

}
