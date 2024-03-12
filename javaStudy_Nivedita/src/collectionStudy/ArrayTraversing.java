package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayTraversing {

	public static void main(String[] args) {
		
		ArrayList<Integer> it=new ArrayList<>();
		it.add(100);
		it.add(200);
		it.add(300);
		it.add(400);
		it.add(500);
		it.add(600);
		it.add(700);
		it.add(800);
		it.add(420);
		it.add(512);
		System.out.println(it);
		
		System.out.println("==============for loop=================");
		for(int i=0;i<=it.size()-1;i++)
		{
			
			System.out.println(it.get(i));
		}
		System.out.println("===========for each loop====================");
		
		
		for(Integer a:it) {
			System.out.println(a);
		}
		System.out.println("==============iterator=========================");
		
		
		Iterator<Integer> ar = it.iterator();
		
		while(ar.hasNext()) {
			System.out.println(ar.next());
		}
		System.out.println("==============list iterator================");
		ListIterator<Integer> itt = it.listIterator();
		while(itt.hasNext()) {
			System.out.println(itt.next());
		}
		
		
		
	}

}
