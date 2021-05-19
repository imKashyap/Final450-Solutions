package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SetBitsUptoN {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        System.out.println(countSetBits(n));
        br.close();
    }

    public static int countSetBits(int n){
        if(n==0)return 0;
        int p=(int)(Math.log(n)/Math.log(2));
        int upto=(1<<(p-1))*p;
        int msb=n-(1<<p)+1;
        int ans=upto+msb+countSetBits(n-(1<<p));
        return ans;

    }
}
