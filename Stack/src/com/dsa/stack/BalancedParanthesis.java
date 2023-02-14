package com.dsa.stack;

import java.util.ArrayDeque;

public class BalancedParanthesis {

	// Time complexity O(n) and space complexity is O(n)

	public static boolean balancedParanthesis(String exp) {

		ArrayDeque<Character> stack = new ArrayDeque<>();

		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '{' || exp.charAt(i) == '[' || exp.charAt(i) == '(') {
				stack.push(exp.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char expression = exp.charAt(i);

				if (checkPair(stack.peek(), expression)) {
					stack.pop();
					continue;
				}
				return false;
			}
		}
		return true;

	}

	public static boolean checkPair(char topElement, char expression) {
		if (topElement == '{' && expression == '}'
				|| topElement == '[' && expression == ']' && topElement == '(' && expression == ')') {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		String exp = "{{}}[])";
		boolean result = balancedParanthesis(exp);
		if (result) {
			System.out.println("Balanced Parathesis");
		} else {
			System.out.println("The given expression is not a balanced paranthesis");
		}

	}

}
