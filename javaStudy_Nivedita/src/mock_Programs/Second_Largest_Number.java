package mock_Programs;

import java.util.ArrayList;
import java.util.TreeSet;

public class Second_Largest_Number {

	public static void main(String[] args) {
		
		 int ar[]= {41,10,75,12,20,60,90,48,30};
		 TreeSet<Integer> tr=new TreeSet<Integer>();
		 
		 for(int list:ar) {
			 tr.add(list);//using treeset all element store in list
		 }
		 System.out.println(ar);
		 ArrayList<Integer>al=new ArrayList<Integer>(tr);//treeset convert into arraylist
		 System.out.println(al.get(al.size()-2));;
	}

}
