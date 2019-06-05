package NewString;

public class ReverseString {

	public static void main(String[] args) {
	String reverse="";
	String s ="ankit";

		System.out.println("Length is" +"  "+ s.length() );
		
		for(int i=s.length()-1;i>=0;i--){
			
			reverse=reverse+s.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
