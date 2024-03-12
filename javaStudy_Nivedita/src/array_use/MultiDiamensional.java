package array_use;

public class MultiDiamensional {

	public static void main(String[] args) {
		int[][]num=new int[2][2];
		num[0][0]=10;
		num[0][1]=20;
		num[1][0]=30;
		num[1][1]=40;
		for(int i=0;i<=num.length-1;i++) {
			for(int j=0;j<=num.length-1;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");
		
		String[][]s=new String[3][3];
		s[0][0]="Nivedita";
		s[0][1]="Nayanaaa";
		s[0][2]="Nitaaaaa";
		s[1][0]="Veditaaa";
		s[1][1]="Dipaaaaa";
		s[1][2]="Kunalaaa";
		s[2][0]="Shalinia";
		s[2][1]="Pravinaa";
		s[2][2]="Shivania";
		
		for(int a=0;a<=s.length-1;a++) {
			for(int b=0;b<=s.length-1;b++) {
				System.out.print(s[a][b]+" ");
			}
			System.out.println();
		}
		
		
		int[][]no=new int[3][3];
		no[0][0]=1;
		no[0][1]=2;
		no[0][2]=3;
		no[1][0]=4;
		no[1][1]=5;
		no[1][2]=6;
		no[2][0]=7;	
		no[2][1]=8;
		no[2][2]=9;
		for(int i=0;i<=no.length-1;i++) {
			for(int j=0;j<=no.length-1;j++) {
				System.out.print(no[i][j]+" ");
			}
			System.out.println();
		}


		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
