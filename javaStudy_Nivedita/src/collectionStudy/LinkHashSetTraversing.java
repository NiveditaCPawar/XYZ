package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSetTraversing {

	public static void main(String[] args) {
		LinkedHashSet<Object> ls=new LinkedHashSet<>();
		ls.add(100);
		ls.add("velocity");
		ls.add("testing");
		ls.add('a');
		ls.add(null);
		ls.add(null);
		ls.add('k');
		ls.add(1025.0f);
		System.out.println(ls);
		System.out.println("===========for each loop===========");
		for(Object lsh:ls) {
			System.out.println(lsh);
		}
		System.out.println("===========iterator===========");
		Iterator<Object> lsh1 = ls.iterator();
		while(lsh1.hasNext()) {
			System.out.println(lsh1.next());
		}
		
		
		
		
		}
		
		
		
	}


