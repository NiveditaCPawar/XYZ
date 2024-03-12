package casting_use;

public class PrimitiveCasting {

	public static void main(String[] args) {
		//1.implicit casting
		int a=99;
		float b=a;
		System.out.println(b);//convert lower data to higher
		System.out.println("============================");
		//2.explicit casting
		float x=999f;
		int y=(int) x;
		System.out.println(y);//convert higher data to lower
		
		System.out.println("============================");
		double p=4587d;
		int q=(int) p;
		System.out.println(q);
	}

}
