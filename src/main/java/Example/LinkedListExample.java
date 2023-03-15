package Example;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();

		// 링크드리스트에 요소 추가
		linkedList.add("자바");
		linkedList.add("파이썬");
		linkedList.add("C++");

		// 링크드리스트의 첫 번째 요소 확인
		System.out.println("링크드리스트의 첫 번째 요소: " + linkedList.getFirst());

		// 링크드리스트의 마지막 요소 제거
		linkedList.removeLast();

		// 링크드리스트 요소 순회
		for (String element : linkedList) {
			System.out.println(element);
		}
	}
}
