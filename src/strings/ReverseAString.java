/*
Problem Statement -
https://practice.geeksforgeeks.org/problems/reverse-a-string/1
*/

package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseAString {
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());

		while (t-- > 0) {
			String str = read.readLine();
			System.out.println(Reverse.reverseWord(str));
		}
	}
}// } Driver Code Ends

//User function Template for Java

class Reverse {
	// Complete the function
	// str: input string
	public static String reverseWord(String str) {
		return String.valueOf(new StringBuilder(str).reverse());
	}
}