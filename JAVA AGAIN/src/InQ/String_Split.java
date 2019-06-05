package InQ;

public class String_Split {

	public static void main(String[] args) {
		
		
		String s ="ankir@shrivastaba@delhi";
		
		String []input=s.split("@");
	input[0]=input[0].toUpperCase();
	input[1]=input[1].toUpperCase();
    input[2]=input[2].toUpperCase();
		
		for(String s1:input){ 
			
			System.out.println(s1);
		}
		
		
		
		
		
		
		

	}

}
