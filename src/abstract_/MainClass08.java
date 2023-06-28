package abstract_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

interface Test08{
	public int num = 100;
	//interface에선 초기화
	public final static String name = "홍길동";
	public  static String name1 = "홍길동";
	public final String name2 = "홍길동";
	//생략된것 사실 같은거
	
}


public class MainClass08 implements Test08 {
	
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
//		ArrayList<String> arr = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		Set<String> set = new HashSet<>();
//		System.out.println(Test08.num);
//		System.out.println(Test08.name);
		System.out.println(num);
		System.out.println(name);
		
	
		
	}
	
	
}
