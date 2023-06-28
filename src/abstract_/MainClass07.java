package abstract_;

import java.util.Scanner;

import javax.security.sasl.SaslException;

class A지상군07 implements Army {

	@Override
	public void attack() {
		System.out.println("지상군 공격");
		
	}

	@Override
	public void defense() {
		System.out.println("지상군 방어");		
	}
	
}

class B공군07 implements Army {

	@Override
	public void attack() {
		System.out.println("비행기 공격");
	}

	@Override
	public void defense() {
		System.out.println("비행기 방어");
	}
	
}



public class MainClass07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		A지상군07 a = new A지상군07();
		B공군07 b = new B공군07();
		
		System.out.println("적이 처들어왔습니다");
		System.out.println("1.지상군 2.공군");
		
		
		int choice = input.nextInt();
		if(choice == 1) {
			System.out.println("지상군이 선택되었습니다.");
		}else {
			System.out.println("공군이 선택되었습니다.");
		}
		
		System.out.println("1.공격 2.방어");
		
		int num = input.nextInt();
		
		if(choice == 1 && num == 1) {
			a.attack();
		}else if(choice == 1 && num == 2) {
			a.defense();
		}
		
		if(choice == 2 && num == 1) {
			b.attack();
		}else if(choice == 2 && num == 2) {
			b.defense();
		}
		
	}
	
	
}
