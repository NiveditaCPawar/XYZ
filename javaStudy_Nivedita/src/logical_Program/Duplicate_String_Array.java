package logical_Program;

public class Duplicate_String_Array {

	public static void main(String[] args) {
	
	String ar[]=
		{"testing","java","webdriver","selenium","java","testing","software","selenium"};
		System.out.println("Duplicate elements are ");
		for(int i=0;i<ar.length;i++)
		{
		for(int j=i+1;j<ar.length;j++)
		{
		if(ar[i].equals(ar[j]))
		{
		System.out.print(ar[j]+" ");
		}
		}
		}
		
	System.out.println("===================================");
	String ar1[]= {"an","pn","cn","an","cn","du","pi","pn","sn","sn"};
	
	for(int i=0;i<ar1.length;i++) 
	{
		for(int j=i+1;j<ar1.length;j++)
		{
			if(ar1[i].equals(ar1[j]))
			System.out.print(ar1[j]+" ");
		}
	}
	}

	
}
