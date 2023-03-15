package Example;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		// 셋에 요소 추가
		set.add("자바");
		set.add("파이썬");
		set.add("C++");

		// 셋 요소 확인
		System.out.println("셋에 \"자바\" 포함 여부: " + set.contains("자바"));

		// 셋 요소 제거
		set.remove("파이썬");

		// 셋 요소 순회
		for (String element : set) {
			System.out.println(element);
		}
	}
}
