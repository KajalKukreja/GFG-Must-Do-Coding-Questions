/*
Problem Statement -
https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
*/

package arrays;

//{ Driver Code Starts
import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayWithGivenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int s = sc.nextInt();

			int[] m = new int[n];
			for (int j = 0; j < n; j++) {
				m[j] = sc.nextInt();
			}

			ArrayList<Integer> res = Subarray.subarraySum(m, n, s);
			for (int ii = 0; ii < res.size(); ii++)
				System.out.print(res.get(ii) + " ");
			System.out.println();
		}
		sc.close();
	}

}// } Driver Code Ends

class Subarray {

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		ArrayList<Integer> subArrayPos = new ArrayList<>();
		int l = 0;
		int r = 0;
		int sum = arr[0];
		
		while (r < n) {
			if (sum == s) {
				subArrayPos.add(l+1);
				subArrayPos.add(r+1);
				return subArrayPos;
			}
			if (sum < s) {
				r++;
				if (r < n) {
					sum += arr[r];
				}
			}
			else {
				sum -= arr[l];
				l++;
			}
		}
		if (subArrayPos.isEmpty()) {
			subArrayPos.add(-1);
		}
		return subArrayPos;
	}
}