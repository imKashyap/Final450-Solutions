package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSortedWithoutExtraSpace {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String line=br.readLine();
        String[] temp=line.trim().split("\\s+");
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
            arr1[i]=Integer.parseInt(temp[i]);
        int m=Integer.parseInt(br.readLine());
        line=br.readLine();
        temp=line.trim().split("\\s+");
        int[] arr2=new int[m];
        for(int i=0;i<m;i++)
            arr2[i]=Integer.parseInt(temp[i]);
        merge(arr1,arr2);
        for(int o: arr1) System.out.print(o+" ");
        System.out.println();
        for(int o: arr2) System.out.print(o+" ");
        br.close();
    }

    private static void merge(int[] arr1, int[] arr2){
        for(int i=0;i< arr1.length;){
            if(arr1[i]<=arr2[0])i++;
            else{
                int t=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=t;
                i++;
                for(int k=0;k< arr2.length-1 && arr2[k]>arr2[k+1] ;){
                    t=arr2[k];
                    arr2[k]=arr2[k+1];
                    arr2[k+1]=t;
                    k++;
                }
            }
        }
    }
}
