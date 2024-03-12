package string_Class;

public class StringMethods {

	public static void main(String[] args) {
		//slength
		String name="Nivedita";
		int slength=name.length();
		System.out.println("name length is "+slength);
		System.out.println("==============================");
		
		String  name1="Nivedita";
		//String uppercase=name1.toUpperCase();//reference variable
		System.out.println(name1.toUpperCase());
		
		System.out.println(name1.toLowerCase());
		
		System.out.println(name1.toUpperCase());
		System.out.println("========================");
		
		//equalsto(.equal)sequence
		String a="nivedita";
		String a2="Nivedita";
		String a3="Nivedita";
		String a7="nivedita";
		String a4=new String("nivedita");
		String a5= new String("Nivedita");
		String a6= new String ("Nivedita");
		
	//	boolean result =a2.equals(a3);
		
		System.out.println(a.equals(a2));
		System.out.println(a2.equals(a3));
		System.out.println(a4.equals(a5));
		System.out.println(a5.equals(a6));
		System.out.println("========================");
		
		//equal ignore(==)memory location
		
		System.out.println(a2==a3);
		System.out.println(a==a2);
				System.out.println(a==a7);
				System.out.println(a4==a5);
				System.out.println(a==a4);
				System.out.println("=============");
				
				//contains
				
				String s="Mahesh";
				String s1="mahesh";
				String s2="Mahesh";
				String s3="MahEsh";
				System.out.println(s.contains(s2));
				System.out.println(s1.contains(s2));
				System.out.println(s2.contains(s3));
				System.out.println();
				System.out.println("=========================");
				
			//is empty	
				String d1="Yogendra";
				String d2="";
				String d3="   ";//not count space
						System.out.println(d1.isEmpty());
						System.out.println(d2.isEmpty());
						System.out.println(d3.isEmpty());
				
						System.out.println("==============");
						
				//is blank
				String c1= "Amol";
				String c2= "";
				String c3="   ";//count white space
				System.out.println(c1.isBlank());
				System.out.println(c2.isBlank());
				System.out.println(c3.isBlank());
				System.out.println("===================");
				
				//charAt
				String k1="Maharashtra";
				System.out.println(k1.charAt(2));
			//	System.out.println(k1.charAt(40));
				System.out.println("===================");
		//endsWith
				String l="velocity";
				System.out.println(l.endsWith("city"));
				System.out.println(l.endsWith("loc"));
				System.out.println("===================");
				
				//startsWith
				System.out.println(l.startsWith("ve"));
				System.out.println(l.startsWith("e"));
				System.out.println("===================");	
				
				//substring
				String n="Nivedita Chhagan Pawar";
				System.out.println(n.substring(15));
				System.out.println(n.substring(07));
				System.out.println("===================");
		
				//concat
				String m="india ";
				String m1="is ";
				String m2="contry";
				System.out.println(m.concat(m1).concat(m2));
				System.out.println("===================");
				
				//indexOf
				System.out.println(m.indexOf('n'));
				System.out.println(n.indexOf('h'));
				System.out.println("===================");
				
				//lastindexof
				System.out.println(n.lastIndexOf('h'));
				System.out.println(n.lastIndexOf('n'));
	}

}
