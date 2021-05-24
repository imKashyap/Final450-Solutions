package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOf2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        long n= Long.parseLong(br.readLine());
        String ans=isPowerofTwo(n)?"YES":"NO";
        System.out.println(ans);
        br.close();
    }
        private static boolean isPowerofTwo(long n){
            if (n==0)return false;
            return (n &(n-1))==0;

        }

}
