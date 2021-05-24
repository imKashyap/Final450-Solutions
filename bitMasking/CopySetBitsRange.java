package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopySetBitsRange {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] temp= br.readLine().trim().split("\\s+");
        int x=Integer.parseInt(temp[0]);
        int y=Integer.parseInt(temp[1]);
        temp= br.readLine().trim().split("\\s+");
        int l=Integer.parseInt(temp[0]);
        int r=Integer.parseInt(temp[1]);
        System.out.println(setSetBit(x,y,l,r));
        br.close();
    }

    private static int setSetBit(int x, int y, int l, int r){
        for(int i=l;i<=r;i++){
            int toCopy=y & 1<<i-1;
            x=x |toCopy;
        }
        return x;
    }
}
