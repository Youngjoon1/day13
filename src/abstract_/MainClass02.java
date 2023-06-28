package abstract_;
/*
 * interface
 * - 추상화 메소드만 포함할 수 있다.
 * - 변수는 static final 형식으로만 만들어진다.
 * - 다중 상속이 가능하다.
 */
interface A02{}
interface B02{
	public void test(); 
	// 인터페이스에선 추상으로
	// 실체화 X
	
}
class C02{
	public void test1() {  }
}
class Test02 implements A02, B02{

	@Override
	public void test() {
	//자식에서 실체화	
	}
	
}
public class MainClass02 {

}
