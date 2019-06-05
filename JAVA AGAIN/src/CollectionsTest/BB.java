package CollectionsTest;

import java.util.HashMap;

public class BB {

	public static void main(String[] args) {
		}

	
	
	public HashMap Calculate(int a, int b) {
		
		
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		
	
		HashMap hm= new HashMap();
		
		hm.put("sum", sum);
		
		hm.put("sub", sub);
		
		hm.put("mul", mul);
		
		hm.put("div", div);
		return hm;
	}
	
	
	
	
	
	
	
	
	
	
	
}
