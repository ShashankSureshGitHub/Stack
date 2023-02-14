package com.dsa.stack;

import java.util.ArrayDeque;

public class PreviousGreaterElementOptimisedApproach {

	public static void previous(int[] arr) {
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(arr[0]);
		System.out.println(arr[0] + ",---- ");
		for (int i = 1; i < arr.length; i++) {
			while (stack.isEmpty() == false && stack.peek() < arr[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				System.out.println(arr[i] + ",----");
			} else {
				System.out.println("previous greater element of" + arr[i] + " is" + stack.peek());
			}
		}

	}

	public static void main(String[] args) {
		int[] stock = { 100, 30, 40, 80, 20, 60, 10, 120 };
		previous(stock);
	}
}
