package collectionStudy;

import java.util.PriorityQueue;

public class QueueUse {

	public static void main(String[] args) {
		PriorityQueue<String>pq=new PriorityQueue<String>();
		pq.add("Nashik1");
		pq.add("Amravati2");
		pq.add("Sambhaji Nagar3");
		pq.add("Pune4");
		pq.add("Mumbai5");
		pq.add("Dhule6");
		System.out.println(pq);
		System.out.println("=====================");
//		pq.clear();
//		System.out.println(pq);
		System.out.println(pq.contains("Kalyan"));
		System.out.println("========================");
		pq.offer("Nanded");
		System.out.println(pq);
		System.out.println("=======================");
		System.out.println(pq.peek());
		System.out.println("=======================");
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println("=======================");
		System.out.println(pq.poll());
		System.out.println(pq);
	
		
		
		
		
		
		
		
	}

}
