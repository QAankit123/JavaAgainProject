package InQ;

public class StringUpercase2 {

	public static void main(String[] args) {
		
		String s ="ankitsrvdelhi";
		
		  int original_length=s.length();
	           String s1=s.replace("i", "");	
		   int new_length= s1.length();
	int	 length = original_length-new_length;
		   
		   
            System.out.println("icomes"+" "+length+"tims");
         
	}

}
