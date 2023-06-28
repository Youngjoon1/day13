package overriding;

public class NewFerrari extends Ferrari {
	public void speed() {
		System.out.println(getYe() + "년식 페라리 속도 : 500km");
	}
	public NewFerrari(int ye) {
		super(ye);
	}
	public void autoSystem() {
		System.out.println("자동 운전모드로 전환합니다!!!");
	}
	
}
