package com.dsa.stack;

import java.util.Stack;

public class InfixToPostfix {

	// To check if the read character is an operand
	public static boolean checkIfOperand(char ch) {

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			return true;
		}
		return false;

	}

	// to check the precedence of the operator

	public static int precedence(char ch) {

		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		case '(':
			return -1;
		default:
			System.out.println("Invalid Expression");
			System.exit(0);
			return 0;
		}

	}

	public static void infixToPostfix(String exp) {

		Stack<Character> stack = new Stack<>();
		StringBuilder postfix = new StringBuilder();
		for (int i = 0; i < exp.length(); i++) {

			if (checkIfOperand(exp.charAt(i))) { // checking if the read character is an operand
				postfix.append(exp.charAt(i));
			} else if (exp.charAt(i) == '(') { // checking if the character is opening bracket
				stack.push(exp.charAt(i));
			} else if (exp.charAt(i) == ')') { // closing bracket instructions
				while (stack.isEmpty() == false && stack.peek() != '(') {
					postfix.append(stack.pop());
				}
				if (stack.isEmpty()) {
					System.out.println("Invalid expression");
					return;
				} else {
					stack.pop();
				}
			} else { // Operator
				while (!stack.empty() && precedence(exp.charAt(i)) <= precedence(stack.peek())) {
					postfix.append(stack.pop());
				}
				stack.push(exp.charAt(i));
			}

		}

		// Once the whole expression is read, transfer the contents of the stack to the
		// postfix expression by pop operation
		while (!stack.empty()) {
			postfix.append(stack.pop());
		}

		System.out.println("Postfix Expression is " + postfix);

	}

	public static void main(String[] args) {
		String expression = " (a+b/c*(d+e)-f)";
		infixToPostfix(expression);
	}

}
