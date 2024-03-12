package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTraversing {

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<>();
		hs.add("hello");
		hs.add("testing");
		hs.add(450);
		hs.add('k');
		hs.add(null);
		hs.add(null);
		hs.add("hello");
		System.out.println(hs);
		System.out.println("=======for each loop=============");
		for(Object hss:hs) {
			System.out.println(hss);
		}
		System.out.println("=======iterator=============");
		Iterator<Object> hs1 = hs.iterator();
		while(hs1.hasNext()) {
			System.out.println(hs1.next());
		}
		
		
		
		
		
		
	}

}
