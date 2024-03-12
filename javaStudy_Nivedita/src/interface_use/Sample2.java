package interface_use;

public interface Sample2 
{

	void test();
	void test1();
	default void nivedita() {
		System.out.println("this is nivedita from sample class2");
	}
	
}
