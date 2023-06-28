package overriding;

public class MainClass02 {
	
	public static void main(String[] args) {
		
		TestClass02 t = new TestClass02();
		t.add("안녕하세요");
		System.out.println(t.get(0));
		t.test();
		
	}

}
