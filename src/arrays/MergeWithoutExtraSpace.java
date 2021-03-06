/*
Problem Statement -
https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
*/

package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeWithoutExtraSpace {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
		while (t-- > 0) {
			String inputLine[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(inputLine[0]);
			int m = Integer.parseInt(inputLine[1]);
			long arr1[] = new long[n];
			long arr2[] = new long[m];
			inputLine = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				arr1[i] = Long.parseLong(inputLine[i]);
			}
			inputLine = br.readLine().trim().split(" ");
			for (int i = 0; i < m; i++) {
				arr2[i] = Long.parseLong(inputLine[i]);
			}

			MergeSort.merge(arr1, arr2, n, m);

			StringBuffer str = new StringBuffer();
			for (int i = 0; i < n; i++) {
				str.append(arr1[i] + " ");
			}
			for (int i = 0; i < m; i++) {
				str.append(arr2[i] + " ");
			}
			System.out.println(str);
		}
	}
}
//} Driver Code Ends

//User function Template for Java

class MergeSort {
	
	// Function to merge the arrays.
	public static void merge(long arr1[], long arr2[], int n, int m) {
		
		long[] res = new long[n+m];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				res[k]  = arr1[i];
				i++;
			}
			else {
				res[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while (i < n) {
			res[k] = arr1[i];
			i++;
			k++;
		}
		
		while (j < m) {
			res[k] = arr2[j];
			j++;
			k++;
		}
		
		System.arraycopy(res, 0, arr1, 0, n);
		System.arraycopy(res, n, arr2, 0, m);
	}
}
