package Example;

import java.util.Hashtable;

public class HashtableExample {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<>();

		// 해시테이블에 요소 추가
		hashtable.put(1, "자바");
		hashtable.put(2, "파이썬");
		hashtable.put(3, "C++");

		// 해시테이블 요소 접근
		System.out.println("Key: 1, Value: " + hashtable.get(1));

		// 해시테이블 요소 제거
		hashtable.remove(2);

		// 해시테이블 요소 순회
		for (int key : hashtable.keySet()) {
			System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
		}
	}
}
