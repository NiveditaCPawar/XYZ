package logical_Program;

public class Duplicate_Element_Array {

	public static void main(String[] args) 
	{
		int[]ar= {1,5,4,7,5,4,9,6,2,3,3,7,9};
		
		for(int i=0;i<ar.length;i++) 
		{
			for(int j=i+1;j<ar.length;j++) 
			{
				if(ar[i]==ar[j]) 
				{
					System.out.print(ar[j]+" ");
				}
			}
		}

	}

}
