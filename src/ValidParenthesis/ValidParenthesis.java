package ValidParenthesis;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
	public boolean isValid(String s) {

		Deque<Character> stack = new ArrayDeque<>();
		System.out.println("s.length() = "+ s.length());
		if (s.length() <= 1 || s.length() > ( Math.pow(10, 4))) {
			return false;
		}
		for (char c : s.toCharArray()) {
			System.out.println("THIS is what you are looking for = "+ c);
			if (c == '(') {
				System.out.println("BEFOR PEEK = "+ stack.peek());
				stack.push(c);
				System.out.println("PUSH Found (");
				System.out.println("AFTER PEEK = "+ stack.peek());
			} else if (c == ')') {
				if (!stack.isEmpty() && stack.peek() == '(') {
					System.out.println("BEFORE PEEK = "+ stack.peek());
					stack.pop();
					System.out.println("POP Found )");
					System.out.println("AFTER PEEK = "+ stack.peek());
				} 

			}
			if (c == '[') {
				System.out.println("BEFORE PEEK = "+ stack.peek());
				stack.push(c);
				System.out.println("PUSH Found [");
				System.out.println("AFTER PEEK = "+ stack.peek());
			} else if (c == ']') {
				if (!stack.isEmpty() && stack.peek() == '[') {
					System.out.println("BEFORE PEEK = "+ stack.peek());
					stack.pop();
					System.out.println("POP Found ]");
					System.out.println("AFTER PEEK = "+ stack.peek());
				}

			}
			if (c == '{') {
				System.out.println("BEFOR PEEK = "+ stack.peek());
				stack.push(c);
				System.out.println("PUSH Found {");
				System.out.println("AFTER PEEK = "+ stack.peek());
			} else if (c == '}') {
				if (!stack.isEmpty() && stack.peek() == '{') {
					System.out.println("BEFOR PEEK = "+ stack.peek());
					stack.pop();
					System.out.println("POP Found }");
					System.out.println("AFTER PEEK = "+ stack.peek());
				} 
			}
			System.out.println("IS STACK ENPTY ===> in LOOP ===>"+ stack.isEmpty());
		}

		return stack.isEmpty();

	}


	public static void main(String[] args){
		String input="test";
		Solution sol = new Solution();

		//		//EXAMPLE 1
		//		input = "()";
		//		System.out.println("EXAMPLE 1 Valid Parenthesis: "+sol.isValid(input) + "  should = TRUE");
		//		System.out.println("\n");
		//		System.out.println("\n");
		//		System.out.println("\n");
		//		//		//EXAMPLE 2
		//		input = "()[]{}";
		//		System.out.println("EXAMPLE 2 Valid Parenthesis: "+sol.isValid(input) + "  should = TRUE");
		//		System.out.println("\n");
		//		System.out.println("\n");
		//		//		//		//EXAMPLE 3
		//		input =  "(]";
		//		System.out.println("EXAMPLE 3 Valid Parenthesis: "+sol.isValid(input) + "  should = FALSE");
		//		System.out.println("\n");
		//		System.out.println("\n");
		//		//		//EXAMPLE 4
		////		input =  "\"([])";
		//
		////
		////		//		//EXAMPLE 5
		////		input =  "([)]";
		////		System.out.println("EXAMPLE 5 Valid Parenthesis: "+sol.isValid(input) + "  should = FALSE");
		////		//System.out.println("\n");
		////		//System.out.println("\n");
		////		
		//		//EXAMPLE 6
		//		input =  "]";
		//		System.out.println("EXAMPLE 6 One Parenthesis: "+sol.isValid(input) + "  should = FALSE");
		//		System.out.println("\n");
		//		System.out.println("\n");
		//
		//		//		//EXAMPLE 6a
		//		input =  "";
		//		System.out.println("EXAMPLE 6a NO Parenthesis: "+sol.isValid(input) + "  should = FALSE");
		//		System.out.println("\n");
		//		System.out.println("\n");
		//
		//		//EXAMPLE 7
		//		input =  "1000][90";
		//		System.out.println("EXAMPLE 7 Parenthesis: "+sol.isValid(input) + "  should = FALSE");
		//		System.out.println("\n");
		//		System.out.println("\n");

		//({{{{}}}))
		input = "({{{{}}}))";
		System.out.println("EXAMPLE 8 ({{{{}}})) Parenthesis: "+sol.isValid(input) + "  should = FALSE");


	}
}
