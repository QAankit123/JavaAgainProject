package MyString;

public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calclucation("ankit srv gurgaon");
		
		
	}
	
	
	public static void Calclucation(String a) {
		 
		    String []input= a.split("\\s");
		    
		            input[0]=input[0].toUpperCase();
		            input[1]=input[1].toUpperCase();
		            input[2]=input[2].toLowerCase();
		            
		          for (String s:input)
		          {
		        	  System.out.println(s);
		          }

	}
	
	

}
