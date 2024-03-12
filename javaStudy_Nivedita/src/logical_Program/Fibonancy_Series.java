package logical_Program;

public class Fibonancy_Series {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;			//1+2=3	2+3=5	3+5=8	4+8=12
		int num=10;
		
		for(int i=1;i<=num;i++) {
		 System.out.println(num1);
			
			 int sum=num1+num2;
			// 1=0+1
			num1=num2;//1
			//num1=1
			num2=sum;//1
			//num2=1
			
			
			
//			int num=20;
//			// 0,1-->1-->2-->3-->5;
//			int num1=0;
//			int num2=1;
//			for(int i=1;i<=num;i++)
//			{
//			System.out.println(num1+" ");
//			int sum = num1+num2;//1,2,3,5,8
//			num1=num2;//num1=1  num1=1  num1=2 num=3
//			num2=sum;//num2=1  num2=2  num2=3  num2=5
		}
		
	}

}
