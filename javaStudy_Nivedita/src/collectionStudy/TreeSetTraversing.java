package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTraversing {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(145);
		ts.add(754);
		ts.add(125);
		ts.add(642);
		ts.add(420);
		ts.add(500);
		ts.add(149);
		ts.add(124);
		ts.add(452);
		System.out.println(ts);
		System.out.println("=========================");
		System.out.println("=======iterator===========");
		Iterator<Integer> tss = ts.iterator();
		while(tss.hasNext()) {
			System.out.println(tss.next());
		}
		System.out.println("=====for each loop=========");
		for(Integer ts1:ts) {
			System.out.println(ts1);
		}
		System.out.println("=============decending order===============");
		Iterator<Integer> ts1 = ts.descendingIterator();
		while(ts1.hasNext()) {
			System.out.println(ts1.next());
		}

	}

}
