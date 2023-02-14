package com.dsa.stack;

public class StackClass {
	static final int max = 5;
	int top;
	int[] stack = new int[max];

	public StackClass() {
		top = -1;
	}

	public void push(int element) {
		if (isFull()) {
			System.out.println("Stack overflow");
		} else {
			stack[++top] = element;

		}

	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return Integer.MIN_VALUE;
		} else {
			return stack[top--];
		}
	}

	public int size() {
		return top + 1;

	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Empty Stack");
			return Integer.MIN_VALUE;
		} else {
			return stack[top];
		}

	}

	public boolean isFull() {
		return top == max - 1;

	}

	public boolean isEmpty() {
		return top == -1;
	}

}
