package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Practice {

	public static void main(String[] args) {
		LinkedList<Object>li=new LinkedList<Object>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(100);
		li.add(150);
		li.add(200);
		li.add(200);
		System.out.println(li);
		System.out.println("===========for loop=========");
		for(int i=0;i<li.size()-1;i++) {
			System.out.println(li.get(i));
		}
		System.out.println("===========for each loop=========");
		
		for( Object l2:li)
		{
			System.out.println(l2);
		}
		System.out.println("===========iterator=========");
		Iterator<Object> l3 = li.iterator();
		while(l3.hasNext()) {
			System.out.println(l3.next());
		//	l3.remove();
		}
		//System.out.println(li);
		
		System.out.println("===========list iterator=========");
		
		ListIterator<Object> l4 = li.listIterator();
		//l4.add(450);
//		while(l4.hasNext()) {
//			System.out.println(l4.next());
//			
//		}
//		l4.add(450);
//		System.out.println(li);
		l4.next();				//using next method for list iterator
		l4.next();
		l4.next();
		l4.add(10000);
		System.out.println(li);
		
	}

}
