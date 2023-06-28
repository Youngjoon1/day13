package overriding;
/*
 * 오버라이딩
 * - 상속받은 자식 메소드의 내용을 변경하는 것
 * - 부모 메소드와 다르게 자신에게 맞게 변경하여 사용한다
 * 오버라이딩 조건
 * - 부모 메소드의 이름과 동일하게 만들어야 한다.
 * - 자식의 접근제한자는 부모의 접근제한자보다 작으면 안된다
 * > private < package < protected < public
 * 
 */
public class MainClass01 {

	public static void main(String[] args) {

//	Ferrari fe = new Ferrari(2023);
//	fe.speed();
	NewFerrari nFe = new NewFerrari(2024);
	nFe.speed();
	nFe.autoSystem();
	
		
	}

}
