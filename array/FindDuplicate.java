package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDuplicate {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String line=br.readLine();
        String[] temp=line.trim().split("\\s+");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(temp[i]);
        int dup=findDuplicate(arr);
        System.out.println(dup);
        br.close();
    }

    private static int findDuplicate(int arr[]){
        if (arr.length<= 1)
            return -1;
        for(int i=0;i< arr.length;i++){
                int v =Math.abs(arr[i]);
                if(arr[v]<=0)return Math.abs(v);
                arr[v] = -1* arr[v];
        }
        return 0;
    }
}
