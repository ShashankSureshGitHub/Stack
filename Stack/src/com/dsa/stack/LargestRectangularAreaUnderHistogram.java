package com.dsa.stack;

// The Time Complexity is O(n^2)....Although there are two inner for loops, both combine do the work of one for loop
// Space Complexity is O(1)
public class LargestRectangularAreaUnderHistogram {

	public static int largestRectangle(int[] arr) {

		int n = arr.length;
		int res = 0;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i - 1; j >= 0; i--) { // For left part traversal
				if (arr[j] > arr[i]) {
					count++;
				} else {
					break;
				}
			}
			for (int j = i + 1; j < n; i++) { // For right part traversal
				if (arr[j] > arr[i]) {
					count++;
				} else {
					break;
				}
			}
			int temp = count * arr[i];
			res = Math.max(res, temp);
		}
		return res;

	}

	public static void main(String[] args) {
		int[] array = { 12, 3, 4, 4, 1, 5, 7 };
		int result = largestRectangle(array);
		System.out.println(result);

	}

}
