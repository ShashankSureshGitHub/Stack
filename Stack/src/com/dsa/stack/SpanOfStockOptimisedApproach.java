package com.dsa.stack;

import java.util.ArrayDeque;

// Highly Important....
// Time complexity is O(n)...Reason: Even though the program has two loops, the element is read only once.
//     |              |
//     | index of 60  |
//     | index of 80  |
//     | index of 100 |
//     |______________|
//Space complexity is O(n)....n elements are stored in n memory blocks of the stack 
// Space complexity in best case is O(1) i.e when the array is in ascending order {10,20,30,....} where each element index is pushed and popped before pushing the next element index
public class SpanOfStockOptimisedApproach {

	public static void Span(int[] arr) {
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(0);
		System.out.println(arr[0] + ",1");
		for (int i = 1; i < arr.length; i++) {
			while (stack.isEmpty() == false && arr[stack.peek()] < arr[i]) {
				stack.pop();
			}
			System.out.println(arr[i] + "," + (stack.isEmpty() ? (i + 1) : (i - stack.peek())));
			stack.push(i);
		}

	}

	public static void main(String[] args) {
		int[] stock = { 100, 30, 40, 80, 20, 60, 10, 120 };
		Span(stock);
	}

}
