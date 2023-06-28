package overriding;

public class Ferrari {

	private int ye;
	public Ferrari(int ye) {this.ye = ye;}
	public int getYe() {return ye;}
	public void speed() {
		System.out.println(ye + "년식 페라리 속도 : 300km");
	}
}
