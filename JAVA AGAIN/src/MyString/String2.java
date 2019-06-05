//*****REVERSE A STRING ***//////

package MyString;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String reverse="";
		String s1= "ankit";
		int length =s1.length();
	    for (int i =length-1;i>=0;i--)
	    {
	    	reverse=reverse+s1.charAt(i);
	    	
	    }
		
		System.out.print(reverse);
		
		
		
	}

}
