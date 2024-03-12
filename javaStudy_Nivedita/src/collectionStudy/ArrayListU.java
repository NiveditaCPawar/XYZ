package collectionStudy;

import java.util.ArrayList;

public class ArrayListU {
	
	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<>();
		al.add("Pune");									//1.add method
		System.out.println(al.add("Nagpur"));
		
		al.add(0, "Nivedita");							//2.add by index
		System.out.println(al);
		
//		al.clear();										//3.clear
//		System.out.println(al);		
		
		Object als = al.clone();			//3.clone
		System.out.println(als);
		
		al.add("maharashtra");
		System.out.println(al);
		
		System.out.println(al.contains("nashik"));		//4.contain
		System.out.println(al.contains("Pune"));
		
		al.ensureCapacity(5);			//5.ensure capacity
		al.add(100);
		System.out.println(al);
		al.add('f');
		System.out.println(al);
		
		System.out.println(al.equals(als));		//5.equals
		
		System.out.println(al.get(3));			//6.get
		
		System.out.println(al.indexOf("maharashtra"));//7.undexof
		
		System.out.println(al.isEmpty());		//8.isempty
//		al.clear();								//9.clear
//		System.out.println(al);
//		System.out.println(al.isEmpty());
		
		al.add("100");
		al.add("Pune");
		al.add('f');
		System.out.println(al);
		
		al.indexOf("Pune");
		System.out.println(al.indexOf("Pune"));			//14.index off
		
		al.lastIndexOf("Pune");						//10.last index
		System.out.println(al.lastIndexOf("Pune"));
		
		al.lastIndexOf("100");
		System.out.println(al.lastIndexOf("100"));
		
		System.out.println(al.remove(6));		//11.remove
		System.out.println(al);
		
		al.set(0, "velocity");					//12.set
		System.out.println(al);
		
		//al.size();							//13.size
		System.out.println(al.size());
		
	
		
		
	
		
	}

}
