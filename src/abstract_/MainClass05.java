package abstract_;

class A지상군05 implements Army {
	
	public void 총알장전() {
		System.out.println("총알 장전");
	}
	public void 방패설치() {
		System.out.println("방패를 설치합니다.");
	}
	
	@Override
	public void attack() {
		총알장전();
		System.out.println("지상군 공격");
	}
	public void attack1() {
		총알장전();
		System.out.println("지상군 공격");
	}
	public void attack2() {
		총알장전();
		System.out.println("지상군 공격");
	}
	public void attack3() {
		총알장전();
		System.out.println("지상군 공격");
	}

	@Override
	public void defense() {
		방패설치();
		System.out.println("지상군 방어");
	}
	
}

public class MainClass05 {

	public static void main(String[] args) {
		//코드 합칠땐 부모호출
		//Upcasting
		Army a = new A지상군05();
		a.attack();a.defense();
		
	}

}
