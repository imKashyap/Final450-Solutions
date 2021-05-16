package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String line=br.readLine();
        String[] temp=line.trim().split("\\s+");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(temp[i]);
        nextPermutation(arr);
        for(int o: arr) System.out.print(o+" ");
        br.close();
    }
    private static void nextPermutation(int[] nums) {
        int r1=-1, r2=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                r1=i-1;
                break;
            }
        }
        if(r1==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[r1]){
                r2=i;
                break;
            }
        }
        int t=nums[r1];
        nums[r1]=nums[r2];
        nums[r2]=t;
        for(int i=r1+1, j= nums.length-1;i<j;i++,j--){
            t=nums[j];
            nums[j]=nums[i];
            nums[i]=t;
        }
    }
}
