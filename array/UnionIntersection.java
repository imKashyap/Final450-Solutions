package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class UnionIntersection {

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
        List<Integer> u=getUnion(arr1, arr2);
        List<Integer> i=getIntersection(arr1, arr2);
        for(int o: u) System.out.print(o+" ");
        System.out.println();
        for(int o: i) System.out.print(o+" ");
        br.close();
    }

    private static  List<Integer> getUnion(int[] arr1, int[] arr2){
        Set<Integer> s= new HashSet<>();
        for(int i=0;i<arr1.length;i++)
            s.add(arr1[i]);
        for(int i=0;i<arr2.length;i++)
            s.add(arr2[i]);
        List<Integer> ans= new ArrayList<>(s);
        return ans;
    }

    private static List<Integer> getIntersection(int[] arr1, int[] arr2){
        Set<Integer> s= new HashSet<>();
        List<Integer> ans= new ArrayList<>(s);
        for(int i=0;i<arr1.length;i++)
            s.add(arr1[i]);
        for(int i=0;i<arr2.length;i++) {
            boolean added = s.add(arr2[i]);
            if(!added)ans.add(arr2[i] );
        }
        return ans;
    }


}
