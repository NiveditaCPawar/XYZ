package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListTraversing {

	public static void main(String[] args)
	{
		LinkedList<String> lt=new LinkedList<>();
		lt.add("pune");
		lt.add("nanded");
		lt.add("mumbai");
		lt.add("nagpur");
		lt.add("baramati");
		lt.add("nandurbar");
		lt.add("jalgaon");
		lt.add("nashik");
		System.out.println(lt);
		
		System.out.println("===========for loop=========");
		for(int i=0;i<lt.size()-1;i++) {
			System.out.println(lt.get(i));
		}
		System.out.println("===========for each loop=========");
		for(String l2:lt)
		{
			System.out.println(l2);
		}
		System.out.println("===========iterator=========");
		Iterator<String> ll = lt.iterator();
		while(ll.hasNext()) {
			System.out.println(ll.next());
		}
		System.out.println("===========list iterator=========");
		ListIterator<String> li = lt.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		
			
			}


		
	}

}
