package com.simplilearn.ArrayExample;

public class ArraysDemo {

	public static void main(String[] args) {

		int[] arr = new int[3];

		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		int[] arr1 = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		int[][] arr2 = { 
				{ 2, 4, 6, 8 }, 
				{ 3, 6, 9 } 
			};

		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		
		System.out.println(arr2[1][1]);
	}

}
