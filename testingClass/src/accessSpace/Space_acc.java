package accessSpace;

import accessSpecifiers.Test1;

public class Space_acc extends Test1 {

	public static void main(String[] args) {
		
		Test1 s1=new Test1();
		//s1.test1(); private
		//s1.test2(); default
		//s1.test3(); protected
		s1.test4();// calling public method from another package
		
		
		Space_acc sp=new Space_acc();
		sp.test3();//protected method using inheritance
		sp.test4();//public method
		
		
		
			
	}

}
