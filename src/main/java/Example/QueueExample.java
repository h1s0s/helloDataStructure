package Example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		// 큐에 요소 추가
		queue.add("자바");
		queue.add("파이썬");
		queue.add("C++");

		// 큐 맨 앞 요소 확인
		System.out.println("큐 맨 앞 요소: " + queue.peek());

		// 큐에서 요소 제거
		queue.remove();
		queue.remove();

		// 큐 요소 순회
		for (String element : queue) {
			System.out.println(element);
		}
	}
}
