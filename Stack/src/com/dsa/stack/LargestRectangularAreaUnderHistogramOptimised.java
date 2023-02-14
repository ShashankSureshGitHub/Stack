package com.dsa.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

// Time complexity is O(n)+O(n)+O(n)=====O(n)

public class LargestRectangularAreaUnderHistogramOptimised {

	public static int largestRectangle(int[] arr) {

		int n = arr.length;
		int result = 0;
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		ArrayList<Integer> prevSmaller = new ArrayList<>();
		ArrayList<Integer> nextSmaller = new ArrayList<>();
		stack.push(0);
		for (int i = 0; i < n; i++) {
			while (stack.isEmpty() == false && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}
			int prev = stack.isEmpty() ? -1 : stack.peek();
			prevSmaller.add(prev);
			stack.push(i);

		}
		while (stack.isEmpty() == false) {
			stack.pop();
		}
		stack.push(n - 1);
		for (int i = n - 1; i >= 0; i--) {
			while (stack.isEmpty() == false && arr[stack.peek()] >= arr[i]) {
				stack.pop();
			}
			int next = stack.isEmpty() ? n : stack.peek();
			nextSmaller.add(next);
			stack.push(i);

		}
		Collections.reverse(nextSmaller);
		for (int i = 0; i < n; i++) {
			int temp = arr[i];
			temp += (i - prevSmaller.get(i) - 1) * arr[i];
			temp += (nextSmaller.get(i) - i - 1) * arr[i];
			result = Math.max(result, temp);
		}

		return result;
	}

	public static void main(String[] args) {
		int array[] = { 4, 2, 1 };
		int area = largestRectangle(array);
		System.out.println("The largest area is" + area);

	}
}
