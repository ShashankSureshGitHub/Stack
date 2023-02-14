package com.dsa.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;



public class NextGreaterElementOptimisedApproach {

	public static void nextGreater(int[] arr) {

		ArrayDeque<Integer> stack = new ArrayDeque<>();
		ArrayList<Integer> result = new ArrayList<>();

		stack.push(arr[arr.length - 1]);
		result.add(-1);

		for (int i = arr.length - 2; i >= 0; i--) {
			while (stack.isEmpty() == false && stack.peek() < arr[i]) {
				stack.pop();
			}
			result.add(stack.isEmpty() ? -1 : stack.peek());
			stack.push(arr[i]);
		}
		reverse(result);
	}

	public static void reverse(ArrayList<Integer> res) {
		Collections.reverse(res);
		for (Integer i : res) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		int array[] = { 10, 30, 20, 40, 50, 70, 60, 89, 85 };
		nextGreater(array);

	}

}
