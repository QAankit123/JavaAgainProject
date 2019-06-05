package MyString;

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1 obj1 =new C1();
		C1 obj2 =new C1();
		String return1="";
		String return2="";
		
		return1=obj1.getstringfirst("condeco");
		
		return2=obj2.getstringsecond("CONDECO");
		
		
		if(return1.equalsIgnoreCase(return2))
		{
			System.out.println("yes same");
		}
		else{
			System.out.println("not same");
		}
	}

}
