/*
Problem Statement -
https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
*/

package arrays;

//{ Driver Code Starts
import java.io.*;

public class KadanesAlgorithm {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
		while (t-- > 0) {
			// size of array
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");

			// adding elements
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}

			Kadane obj = new Kadane();

			// calling maxSubarraySum() function
			System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends

class Kadane {

	// Function to find subarray with maximum sum
	// arr: input array
	// n: size of array
	int maxSubarraySum(int arr[], int n) {
		int maxSum = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum > maxSum) {
				maxSum = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}

}