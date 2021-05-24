package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinimizeHeightsDiff {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String line= br.readLine();
        String[] temp= line.trim().split("\\s+");
        int[] arr= new int[n];
        for(int i=0;i<temp.length;i++)
            arr[i]=Integer.parseInt(temp[i]);
        int k= Integer.parseInt(br.readLine());
        int max= getMinDiff( arr, n ,k);
        System.out.println(max);
        br.close();
    }

    private static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int min_elem, max_elem;
        int ans = arr[n-1] - arr[0];
        for (int i=1 ; i<=n-1; i++){
            if (arr[i] >= k){
                max_elem = Math.max(arr[i-1] + k, arr[n-1] - k );
                min_elem = Math.min(arr[0] + k, arr[i] - k );
                ans = Math.min(ans, max_elem - min_elem);
            }
            else
                continue;
        }
        return ans;
    }
}
