/*
Problem Statement -
https://practice.geeksforgeeks.org/problems/sum-of-array-elements2502/1
*/

package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfArrayElements {
	
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(read.readLine());
			String str[] = read.readLine().trim().split(" ");

			int input[] = new int[n];
			for (int i = 0; i < n; i++) {
				input[i] = Integer.parseInt(str[i]);
			}
			System.out.println(Get.sumElement(input, n));
		}
	}
}

//} Driver Code Ends

//User function Template for Java

class Get {
	
	public static int sumElement(int arr[], int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
