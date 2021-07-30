package largestSumContiguousSubarray;

import java.util.Scanner;

public class LargestSumContiguousSubarray {
	
	public static int maxSumSubarray(int arr[], int size) {
		int maxGlobal = Integer.MIN_VALUE;
		int maxLocal = arr[0];
		int start = 0;
		int stop = 0;
		for(int i=0; i<size; i++) {
			maxLocal = maxLocal + arr[i];
			if(maxLocal>maxGlobal) {
				maxGlobal = maxLocal;
				stop = i;
			}
			if(maxLocal<0) {
				maxLocal = 0;
				start = i+1;
			}
		}
		System.out.println("the maximum sum subarray is");
		for(int i=start; i<=stop; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("max Sum is");
		return maxGlobal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[] =new int[size];
		System.out.println("enter each element of array and press enter");
		for(int i=0; i<size; i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println("provided array");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(LargestSumContiguousSubarray.maxSumSubarray(arr, size));
		sc.close();
	}
}
