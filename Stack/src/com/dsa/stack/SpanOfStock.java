package com.dsa.stack;

public class SpanOfStock {

	// TIME COMPLEXITY= O(N^2)...... SPACE COMPLEXITY O(1)

	public static void span(int[] stock) {

		int n = stock.length;
		for (int i = 0; i < n; i++) {
			int spanNumber = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (stock[j] < stock[i])
					spanNumber++;
				else
					break;
			}
			System.out.println(stock[i] + "," + spanNumber);
		}

	}

	public static void main(String[] args) {
		int[] array = { 100, 20, 10, 60, 5, 120, 1, 55 };
		span(array);

	}

}
