package dsa.StackAndQueue;

import java.util.Stack;

/*
 * 													Valid parentheses
 * 												========================
 * 
 * Given a string of opening and closing brackets([,{(,),},]) which represent 
 * an expression. check if the expression is valid. Valid expression is one where opening and closing brackets
 * match up well.
 * 
 * Sample input - 
 * expression - {()}[]
 * sample output - true
 */
public class ValidParenth {
	public static void main(String[] args) {
		// String string = "[{()}]()";
		String string = "[{()}]([])";
		System.out.println(isValid(string));
	}

	public static boolean isValid(String str) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);

			} else {
				if (st.size() == 0) {
					return false; // more closing brackets
				}
				if (ch == ')' && st.peek() == '(') {
					st.pop();
				} else if (ch == '}' && st.peek() == '{') {
					st.pop();
				} else if (ch == ']' && st.peek() == '[') {
					st.pop();
				} else {
					return false; // miss - match
				}
			}
		}
		if (st.size() == 0) {
			return true;
		} else {
			return false; // extra opening brackets
		}
	}
}
