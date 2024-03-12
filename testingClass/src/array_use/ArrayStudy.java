package array_use;

public class ArrayStudy {

	public static void main(String[] args) {
		
		String students[]=new String[10];
		students[0]="Aakash";
		students[1]="Dipti";
		students[2]="Rohan";
		students[3]="Amar";
		students[4]="aakshata";
		students[5]="Nivedita";
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		System.out.println(students[3]);
		System.out.println(students[4]);
		System.out.println(students[5]);
		System.out.println(students[6]);
		System.out.println("========================");
		
		int table[]=new int[10];
		table[0]=2;
		table[1]=4;
		table[2]=6;
		table[3]=8;
		table[4]=10;
		table[5]=12;
		
		
		for(int a=0;a<=5;a++)//static for loop
		{
			System.out.println(table[a]);
		}
		System.out.println("========================");
		for(int i=0;i<=table.length-1;i++)//dynamic for loop
		{
			System.out.println(table[i]);
		}
		System.out.println("========================");
		float height[]=new float[5];
		height[0]=10f;
		height[1]=11f;
		height[2]=12f;
		height[3]=13f;
		height[4]=14f;
		for(int f=0;f<=height.length-1;f++) {
		    System.out.println(height[f]);
		}
		System.out.println("========================");
		for(int k=0;k<=4;k++) {
			System.out.println(height[k]);
		}
		System.out.println("========================");
		String s[]=new String[6];
		s[0]="cricket";
		s[1]="hocky";
		s[2]="wollyboll";
		s[3]="carom";
		s[4]="chess";
		s[5]="hello";
		
		
		for(int d=0;d<=5;d++) {
			System.out.println(s[d]);
		}
		System.out.println("========================");
		
			for(int r=0;r<=s.length-1;r++) {
				System.out.println(s[r]);
			}
		
			System.out.println("========================");
		String [] b=new String[5];
		b[0]="hi";
		b[1]="hii";
		b[2]="by";
		b[3]="bye";
		b[4]="byee";
		for(int i=0;i<=4;i++) {
			System.out.println(b[i]);
		}
		System.out.println("========================");
		for(int a=0;a<=b.length-1;a++) {
			System.out.println(b[a]);
		}
		
		
		
	}
		
	
	
	
	
	
	
	
	
	}


