package overriding;

public class TestClass06 {
	String name = "홍길동";
	int age = 20;
	@Override
	public String toString() {
		return "TestClass06["+ name +"," + age+"]";
	}
	
}
