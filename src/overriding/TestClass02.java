package overriding;

import java.util.ArrayList;

public class TestClass02 extends ArrayList<String> {
	
	public void test() {
		System.out.println("추가기능");
	}

	
	public boolean add(String e) {
		System.out.println("내용을 추가해주는 기능 실행");
		System.out.println("잘 동작 되나요.,????");
		return super.add(e);
	}
	
}
