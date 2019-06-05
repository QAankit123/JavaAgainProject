package InQ;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
    int first =0;
    int second =1;
    int next;
    int i =0;
    System.out.print(first+""+second);
	
	
	while(i<10)
	{
		next=first+second;
		first=second;
		second=next;
		System.out.print(next);
		i++;
	}	
		
		
	}	
	}


