package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideWithoutOperator {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] temp= br.readLine().trim().split("\\s+");
        int x=Integer.parseInt(temp[0]);
        int y=Integer.parseInt(temp[1]);
        System.out.println(divide(x,y));
        br.close();
    }

    //find x/y
    private static int divide(int x, int y){
        int sign=(x<0)^(y<0)?-1:1;
        int ans=0;
        x=Math.abs(x);
        y=Math.abs(y);
        while(x>0){
            x-=y;
            ans++;
        }
        if(x<0)ans--;
        return ans*sign;
    }
}
