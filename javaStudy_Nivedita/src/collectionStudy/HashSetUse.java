package collectionStudy;

import java.util.HashSet;

public class HashSetUse {

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<>();
		hs.add(100);
		hs.add("hello");
		hs.add('f');
		hs.add('s');
		hs.add(5);
		hs.add(10.557f);
		System.out.println(hs);
		System.out.println("=======================");
//		hs.clear();
//		System.out.println(hs);
//		hs.clone();
//		System.out.println(hs.clone());
		System.out.println("==========================");
		hs.contains(5);
		System.out.println(hs.contains(5));
		System.out.println("==========================");
//		hs.hashCode();
//		System.out.println(hs.hashCode());
		System.out.println("==============================");
		hs.isEmpty();
		System.out.println(hs.isEmpty());
		System.out.println("==============================");
		hs.remove(10.557f);
		System.out.println(hs);
		System.out.println("================================");
		hs.size();
		System.out.println(hs.size());
		System.out.println("==============================");
		
		
		
		
		
		
		
	}

}
