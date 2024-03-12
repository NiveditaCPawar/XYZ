package collectionStudy;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTraversing {

	public static void main(String[] args) {
	Vector<Object>v=new Vector<Object>();
	v.add(100);
	v.add("mansi");
	v.add('f');
	v.add(250);
	v.add("velocity");
	v.add("testing");
	v.add("velocity");
	v.add(512);
	System.out.println(v);
	
	v.capacity();
	System.out.println(v.capacity());
//	v.clear();
//	System.out.println(v);
	v.clone();
	System.out.println(v.clone());
	v.contains(150);
	System.out.println(v.contains(150));
	v.elementAt(5);
	System.out.println(v.elementAt(5));
	v.ensureCapacity(0);
	
	//for loop,for each loop,listIterator,iterator,enumeration
	System.out.println("========iterator=======");
	Iterator<Object> v1 = v.iterator();
	
	while(v1.hasNext()) {
		System.out.println(v1.next());
	}
	System.out.println("========for each loop=======");
	
	for(Object vr:v) {
		System.out.println(vr);
	}
	System.out.println("========for loop=======");
	
	
	for(int i=0;i<v.size();i++) {
		System.out.println(v.get(i));
	}
	System.out.println("=========enumeration===========");
	
	Enumeration<Object> vv = v.elements();
	while(vv.hasMoreElements()) {
		System.out.println(vv.nextElement());
	}
	System.out.println("==========ListIterator");
	
	ListIterator<Object> v5 = v.listIterator();
	
	while(v5.hasNext()) {
		System.out.println(v5.next());
	}
	
	
	
	
	
	

	}

}
