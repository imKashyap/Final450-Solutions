package array;

import java.io.*;

public class GetMinMax {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String line=br.readLine();
        String[] temp=line.trim().split("\\s+");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(temp[i]);
        int min=getMin(arr, n);
        int max=getMax(arr, n);
        System.out.println(min+","+max);
        br.close();
    }

    static int getMin(int[] a,int n){
        if(n==2)return Math.min(a[0],a[1]);
        return Math.min(getMin(a, n-1), a[n-1]);
    }
    
    static int getMax(int[] a,int n){
        if(n==2)return Math.max(a[0],a[1]);
        return Math.max(getMax(a, n-1), a[n-1]);
    }
}
