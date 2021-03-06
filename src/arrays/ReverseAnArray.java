/*
Problem Statement -
https://practice.geeksforgeeks.org/problems/reverse-an-array/1/
*/

package arrays;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		while (testCases-- > 0) {
			int sizeOfArray = scanner.nextInt();
			int[] array = new int[sizeOfArray];
			for (int i = 0; i < sizeOfArray; i++) {
				array[i] = scanner.nextInt();
			}
			
			//reverse the array
			for (int i = 0; i < sizeOfArray/2; i++) {
				int temp = array[i];
				array[i] = array[sizeOfArray-1-i];
				array[sizeOfArray-1-i] = temp;
			}
			
			//print reverse array
			for (int i = 0; i < sizeOfArray; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
