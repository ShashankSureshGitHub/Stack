package com.dsa.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class LargestRectangleWithAll1s {

	public static int largestHistRow(int[] arr) {

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

	public static int maxArea(int R, int C, int[][] rec) {

		int res = largestHistRow(rec[0]);
		for (int i = 1; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (rec[i][j] == 1) {
					rec[i][j] += rec[i - 1][j];
				}
			}
			res = Math.max(res, largestHistRow(rec[i]));
		}
		return res;

	}

	public static void main(String[] args) {
		int R = 4;
		int C = 4;
		int Rectangle[][] = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };
		System.out.println("The largest Rectangle with all 1s is" + maxArea(R, C, Rectangle));

	}

}
