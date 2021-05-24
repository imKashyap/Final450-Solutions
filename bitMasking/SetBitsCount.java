package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SetBitsCount {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        System.out.println(setBits(n));
        br.close();

    }

   private static int setBits(int N) {
        int count=0;
        while(N!=0){
            count++;
            N=N&N-1;
        }
        return count;
    }
}
