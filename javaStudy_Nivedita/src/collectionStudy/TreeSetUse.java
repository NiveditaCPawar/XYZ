package collectionStudy;

import java.util.TreeSet;

public class TreeSetUse {

	public static void main(String[] args) {
		TreeSet<Object> ts=new TreeSet<Object>();
		ts.add("Abhishek");
		ts.add("Amar");
		ts.add("Sameer");
		ts.add("Saundarya");
		ts.add("Kanak");
		ts.add("Zareen");
		ts.add("Mahesh");
		ts.add("Bhagyashree");
		ts.add("Nivedita");
		System.out.println(ts);
		
		System.out.println("====================");
		System.out.println(ts.ceiling("Saumya"));//1.ceilling
		System.out.println("====================");
//		ts.clear();								//2.clear
//		System.out.println(ts);
		//System.out.println("====================");
		ts.clone();
		System.out.println(ts);					//3.clone
		System.out.println("====================");
		System.out.println(ts.contains("Dipti"));//4.contains
		System.out.println("======================");
		System.out.println(ts.first());			//5.first
		System.out.println("=====================");
		System.out.println(ts.last());			//6.last
		System.out.println("======================");
		System.out.println(ts.floor("Bhagyashree"));//7.floor
		System.out.println("=====================");
		System.out.println(ts.higher("Amar"));		//8.higher
		System.out.println("=====================");
		System.out.println(ts.isEmpty());			//9.isEmpty
		System.out.println("=====================");
		System.out.println(ts.last());				//10.last
		System.out.println("=====================");
		System.out.println(ts.lower("Mahesh"));		//11.lower
		System.out.println("======================");
		System.out.println(ts.pollLast());			//12.polllast
		System.out.println("=======================");
		System.out.println(ts.pollFirst());			//13.pollfirst
		System.out.println("=======================");
		System.out.println(ts.size());				//14.size
		System.out.println("=======================");
		//System.out.println(ts.spliterator());
		
		
		
		
	}

}
