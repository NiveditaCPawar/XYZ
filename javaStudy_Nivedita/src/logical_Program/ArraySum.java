package logical_Program;



public class ArraySum {

	public static void main(String[] args) {
		
		int ar[]= {1,2,0,7,5,4,8,9,4,5,3,8,10,5,9};
		int sum=0;
		for(int i=0;i<=ar.length-1;i++) {
			sum=sum+ar[i];
			//   1=0+1
			//   3=1+2
		}
		System.out.println(sum);
	}

}
