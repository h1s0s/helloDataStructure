package Example;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		// 스택에 요소 추가
		stack.push("자바");
		stack.push("파이썬");
		stack.push("C++");

		// 스택 맨 위 요소 확인
		System.out.println("스택 맨 위 요소: " + stack.peek());

		// 스택에서 요소 제거
		stack.pop();
		stack.pop();

		// 스택 요소 순회
		for (String element : stack) {
			System.out.println(element);
		}
	}
}
