package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSumSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String line= br.readLine();
        String[] temp= line.trim().split("\\s+");
        int[] arr= new int[n];
        for(int i=0;i<temp.length;i++)
            arr[i]=Integer.parseInt(temp[i]);
        int max= maxSumSubarray( arr);
        System.out.println(max);
        br.close();
    }
    private static int maxSumSubarray(int[] arr){
        int max=arr[0];
        boolean allNeg=true;
        for (int j : arr) {
            if (j > 0) {
                allNeg = false;
                break;
            }
            if (j > max) max = j;
        }
        if(allNeg)return max;
        max=0;
        int cur=0;
        for (int j : arr) {
            cur += j;
            if (cur > max) max = cur;
            if (cur < 0) cur = 0;
        }
        return max;
    }
}
