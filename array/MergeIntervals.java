package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class MergeIntervals {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int[][] arr= new int[n][2];
        for(int i=0;i<arr.length;i++){
            String line= br.readLine();
            String[] temp= line.trim().split("\\s+");
            arr[i]=new int[]{Integer.parseInt(temp[0]),Integer.parseInt(temp[1])};
        }
        int[][] ans= merge( arr);
        for(int i=0;i<ans.length;i++)
            System.out.println(ans[i][0]+" "+ans[i][1]);
        br.close();
    }
    private static int[][] merge(int[][] intervals) {
        LinkedList<int[]> list= new LinkedList<>();
        for(int i=0;i<intervals.length;i++)
            list.add(intervals[i]);
        Collections.sort(list,(a, b)->{
            if(a[0]==b[0])return a[1]-b[1];
            return a[0]-b[0];
        });
        int i=0, j=1;
        while(j<list.size()){
            int[] current=list.get(i);
            int[] toCompare=list.get(j);
            if(toCompare[0]>current[1]){
                i++;j++;continue;
            }
            else{
                current[0]=Math.min(current[0],toCompare[0]);
                current[1]=Math.max(current[1],toCompare[1]);
                list.remove(j);
            }
        }
        int[][] ans= new int[list.size()][2];
        for( i=0;i<ans.length;i++)
            ans[i]=list.get(i);
        return ans;
    }
}
