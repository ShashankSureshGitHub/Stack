package com.dsa.stack;

// Time complexity is O(n2)
// space complexity is O(1)
public class NextGreaterElementNaiveApoproach {

	public static void nextGreater(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					System.out.println("Next greater element of " + arr[i] + " is " + arr[j]);
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Next greater element of " + arr[i] + " is -------");
			}
		}

	}

	public static void main(String[] args) {
		int[] array = { 10, 30, 20, 40, 70, 80, 5, 78 };
		nextGreater(array);
	}

}
