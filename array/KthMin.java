package array;

import java.io.*;
class KthMin {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String line=br.readLine();
        String[] temp=line.trim().split("\\s+");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(temp[i]);
		int k=Integer.parseInt(br.readLine());
		System.out.print(kthSmallest(arr, 0, arr.length - 1, k));
		br.close();
	}

	public static int partition(int[] arr, int l,int r){
		int x = arr[r], i = l;
		for (int j = l; j <= r - 1; j++) {
			if (arr[j] <= x) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[r];
		arr[r] = temp;
		return i;
	}
	
	public static int kthSmallest(int[] arr, int l,int r, int k){
		if (k > 0 && k <= r - l + 1) {
			int pos = partition(arr, l, r);
			if (pos - l == k - 1)
				return arr[pos];
			if (pos - l > k - 1)
				return kthSmallest(arr, l, pos - 1, k);
			return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
		}
		return Integer.MAX_VALUE;
	}
}

