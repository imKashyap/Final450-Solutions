package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NonRepeatingNo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[ 2*n+2];
        String line = br.readLine();
        String[] temp = line.trim().split("\\s+");
        for (int i = 0; i < 2*n+2; i++)
            arr[i] = Integer.parseInt(temp[i]);
        int[] ans=singleNumber(arr);
        System.out.println(ans[0]+" "+ans[1]);
        br.close();
    }

    private static  int[] singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
            ans=ans^nums[i];
        int cpy= ans;
        int id=0;
        while(cpy!=0){
            int t=1<<id;
            if((cpy & t)!=0)break;
            id++;
        }
        List<Integer> l= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int t=1<<id;
            if((nums[i] & t)==(ans & t))
                l.add(nums[i]);
        }
        for(int i=0;i<l.size();i++)
            ans= ans^l.get(i);
        int[] arr= new int[2];
        arr[0]=Math.min(ans, ans^cpy);
        arr[1]=Math.max(ans, ans^cpy);
        return arr;
    }
}
