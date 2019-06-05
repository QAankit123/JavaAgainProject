package InQ;

public class StringUpperCase {

	public static void main(String[] args) {

		String s ="ankit shrivastava delhi";
		String arr[]=s.split(" ");
		
		arr[0]=arr[0].toUpperCase();
		arr[1]=arr[1].toUpperCase();
		arr[2]=arr[2].toUpperCase();
		for(String s1:arr){
			System.out.println(s1);
		}
	}
       
}
