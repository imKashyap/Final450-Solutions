package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositionOfSetBit {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        System.out.println(findPosition(n));
        br.close();
    }

    private static int findPosition(int N) {
        if(N==0)return -1;
        if((N & N-1)!=0)return -1;
        int ans=(int)(Math.log(N)/Math.log(2));
        return ans+1;
    }
}
