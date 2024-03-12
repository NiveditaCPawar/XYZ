package logical_Program;

import java.util.ArrayList;
import java.util.TreeSet;

public class Second_Largest_Number {

	public static void main(String[] args) {
		
		int ar[]= {4,8,2,4,6,5,7,1,9};
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		for(int number:ar) {
			ts.add(number);
		}
		
		System.out.println(ar);//1,2,4,5,6,7,8,9
	
	ArrayList<Integer> al=new ArrayList<Integer>(ts);
	System.out.println(al.get(0));
	System.out.println(al.get(al.size()-2));
	
	
	}
}
