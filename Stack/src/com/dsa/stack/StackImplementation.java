package com.dsa.stack;

public class StackImplementation {

	public static void main(String[] args) {
		StackClass s = new StackClass();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		System.out.println("The current size of the stack is " + s.size());
		System.out.println("The popped element is" + s.pop());
		String result;
		System.out.println(result = (s.isEmpty()) ? "Stack is empty" : "Stack is not empty");
		System.out.println(result = (s.isFull()) ? "Stack is full" : "Stack is not full");
	}

}
