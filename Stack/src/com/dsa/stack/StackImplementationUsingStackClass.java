package com.dsa.stack;

import java.util.Stack;

public class StackImplementationUsingStackClass {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		// To push an element onto the stack
		System.out.println(stack.push(10)); // IMPORTANT< RETURNS THE OBJECT PUSHED UNLIKE THE OTHER IMPLEMENTATIONS
											// WHERE RETURN TYPE IS VOID
		stack.push(10);
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

		// to search for an object in the stack
		System.out.println(stack.contains(10));

		// Very Important!!!!!!
		// To search for the position of the object in the stack
		System.out.println(stack.search(10));// returns the position from the top....returns -1 if the object is not
												// present;

		for (Integer i : stack) // Important...Displays from the bottom of the stack.... major disadvantage
			System.out.print(i + " ");
	}

}
