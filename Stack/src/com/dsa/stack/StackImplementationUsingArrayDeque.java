package com.dsa.stack;

import java.util.ArrayDeque;

public class StackImplementationUsingArrayDeque {
	public static void main(String[] args) {
		ArrayDeque<Integer> stack = new ArrayDeque<>();

		// To push an element onto the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		// to get the size of the stack
		System.out.println(stack.size());
		// to peek
		System.out.println(stack.peek());
		// to pop the element
		System.out.println(stack.pop()); // throws NoSuchElementException if the stack is empty(Stack Underflow
											// situation)
		// to check if the stack is empty
		System.out.println(stack.isEmpty());

		for (Integer i : stack) // violates the basic rule of a stack by being able to display all the objects
								// in the stack
			System.out.print(i + " ");
	}

}
