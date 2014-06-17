package level2;

import java.util.Stack;

public class Valid_Parentheses {

	public static void main(String[] args) {
		System.out.println(isValid("()"));
	}

	public static boolean isValid(String s) {
		Stack<Character> stk = new Stack<Character>();
		if (s.equals(""))
			return true;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{')
				stk.push(c);
			else {
				if (stk.isEmpty() || c == ')' && stk.pop() != '(' || c == '}'
						&& stk.pop() != '{' || c == ']' && stk.pop() != '[')
					return false;
			}
		}
		return stk.isEmpty();
	}
}
