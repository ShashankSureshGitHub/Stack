package com.dsa.stack;

public class PreviousGreaterElementNaiveApproach {

	public static void greater(int[] array) {

		int n = array.length;
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = i - 1; j >= 0; j--) {
				if (array[j] > array[i]) {
					flag = true;
					System.out.println(array[i] + ", " + array[j]);
					break;
				}
			}
			if (flag == false)

				System.out.println(array[i] + ", -----");
		}

	}

	public static void main(String[] args) {
		int[] array = { 50, 30, 40, 20, 10 };
		greater(array);

	}
}
