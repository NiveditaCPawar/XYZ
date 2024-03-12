package interface_use;

public interface Sample3 
{

	void demo();
	void demo1();
	default void nivedita()
	{
		System.out.println("nivedita from sample 3");
}

}