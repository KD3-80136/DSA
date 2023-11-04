package com.sunbeam;

public class Expression 
{
	private Stack st;

	public Expression() {
		st = new Stack(10);
	}

	public static int priority(char op) {
		switch (op) {
		case '$':
			return 11;
		case '/':
			return 10;
		case '*':
			return 10;
		case '%':
			return 10;
		case '+':
			return 9;
		case '-':
			return 9;
		}
		return 0;
	}

	public static int calculate(int op1, char opr, int op2) {
		switch (opr) {
		case '+':
			return op1 + op2;
		case '-':
			return op1 - op2;
		case '/':
			return op1 / op2;
		case '*':
			return op1 * op2;
		case '%':
			return op1 % op2;
		}
		return 0;
	}

	public int postfixEvalutation(String postfix) {
		for (int i = 0; i < postfix.length(); i++) {
			char ele = postfix.charAt(i);
			if (Character.isDigit(ele)) {
				// If the character is a digit, keep reading until a non-digit is encountered
				StringBuilder operand = new StringBuilder();
				while (i < postfix.length() && Character.isDigit(postfix.charAt(i))) {
					operand.append(postfix.charAt(i));
					i++;
				}
				i--; // Move back one step to handle non-digit character

				st.push(Integer.parseInt(operand.toString()));
			} else {
				int op2 = st.pop();
				int op1 = st.pop();
				int res = calculate(op1, ele, op2);

				st.push(res);
			}
		}
		if (!st.isEmpty())
			return st.pop();
		return 0;
	}

	public int prefixEvaluation(String prefix) {
		for (int i = prefix.length() - 1; i >= 0; i--) {
			char ele = prefix.charAt(i);
			if (Character.isDigit(ele)) {
				// If the character is a digit, keep reading until a non-digit is encountered
				StringBuilder operand = new StringBuilder();
				while (i >= 0 && Character.isDigit(prefix.charAt(i))) {
					operand.insert(0, prefix.charAt(i));
					i--;
				}
				i++; // Move back one step to handle non-digit character

				st.push(Integer.parseInt(operand.toString()));
			} else {
				int op1 = st.pop();
				int op2 = st.pop();

				int res = calculate(op1, ele, op2);

				st.push(res);
			}
		}
		if (!st.isEmpty())
			return st.pop();
		return 0;
	}
}
