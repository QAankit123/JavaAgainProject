package MyString;

public class C1 {

	
	public String getstringfirst(String s1){
	String rev1="";	
    int ActualLength1=0;
    int CompareTill=4;
    int ActualCompare1;
    ActualLength1=s1.length();
	
    ActualCompare1=ActualLength1-CompareTill;
	
	for(int i =ActualLength1-1;i>=ActualCompare1;i--)
	{
		rev1=rev1+s1.charAt(i);
	}
	return rev1;
	 
	}
	
	public String getstringsecond(String s2){
	
		String rev2="";	
	    int ActualLength2=0;
	    int CompareTill=4;
	    int ActualCompare2;
	    ActualLength2=s2.length();
		
	    ActualCompare2=ActualLength2-CompareTill;
	
	
	
	    for(int i =ActualLength2-1;i>=ActualCompare2;i--)
		{
			rev2=rev2+s2.charAt(i);
		}
		return rev2;
		 
		}
	
	
	
	
	}
	

