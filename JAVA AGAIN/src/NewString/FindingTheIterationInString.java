package NewString;

public class FindingTheIterationInString {

	public static void main(String[] args) {
		
		
		Find("ABCBDBE","B");
		
	}
	
	
	
	public static void Find(String s,String element_to_be_search ){
		
		int count=0;
		
		for(int i=0;i<s.length();i++){
			
			if(s.contains("B")){
				
				count=count+1;
			}
			
			
			
		}
	
	
	      
		 System.out.println(count);
	
	
	
	
	
	
	
	}
	
	
	

}
