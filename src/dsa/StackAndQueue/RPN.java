package dsa.StackAndQueue;

import java.util.Stack;

/*
 * 									Evaluate Reverse Polish Notation
 * 								=======================================
 * 	Evaluate the value of arithmetic expression given in Reverse Polish Notation.
 *  Reverse Polish Notation - it is a notation in which operators follow their operands.
 *  Note - The given expression always evaluate to a result. 
 *  					- Operators are only +,-,*and/.
 *  						TC == O(n)
 *  						SC == O(d)
 *  Sample input 
 *  Expression = {"2","3","*","4","+"}
 *  Expression = {"2","-11","18","3","/","+","*","20","+"}
 *  Sample Output 
 *  10
 */
public class RPN {
	public static void main(String[] args) {
		String[] exp = { "2", "-11", "18", "3", "/", "+", "*", "20", "+" };
		System.out.println(calculateRPN(exp));
	}

	public static int calculateRPN(String[] exp) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < exp.length; i++) {
			String str = exp[i];
			if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
				int pop1 = st.pop();
				int pop2 = st.pop();
				st.push(solve(pop2, pop1, str));
			} else {
				st.push(Integer.parseInt(str));
			}
		}
		return st.pop();
	}

	public static int solve(int pop2, int pop1, String oprtr) {
		if (oprtr.equals("+")) {
			return pop2 + pop1;
		} else if (oprtr.equals("-")) {
			return pop2 - pop1;
		} else if (oprtr.equals("*")) {
			return pop2 * pop1;
		} else {
			return pop2 / pop1;
		}

	}
}
