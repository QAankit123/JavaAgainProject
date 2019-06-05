package MyString;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int actual =0;
		int CompareTill=4;
		int length1 =0;
		int length2 =0;
		String s1="condeco";
		String s2="CONDECO";
		String reverse1="";
		String reverse2="";
		
		length1=s1.length();
		
		actual=length1-CompareTill;
		
		//System.out.println(actual);
		
		for (int i=length1-1;i>=actual;i--)
		{
			reverse1=reverse1+s1.charAt(i);
		}
		
		//System.out.println(reverse1);
		
		length2 = s2.length();
		for (int i=length2-1;i>=actual;i--)
		{
			reverse2=reverse2+s1.charAt(i);
		}
		
		if(s1.equals(s2))
		{
			System.out.println("Yes same");
		}
		else {
		       System.out.println("not same");
		}
		
		
	}

}
