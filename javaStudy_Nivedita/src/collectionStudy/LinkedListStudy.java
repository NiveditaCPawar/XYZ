package collectionStudy;

import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(100);
		ll.add(150);
		ll.add(200);
		ll.add(200);
		System.out.println(ll);
		
		ll.add(0, null);
		System.out.println(ll);
		
		ll.addFirst(250);
		System.out.println(ll);
		ll.addLast(10000);
		System.out.println(ll);
		//ll.clear();
//		System.out.println(ll);
//		ll.clone();
//		System.out.println(ll);
		ll.contains(450);
		System.out.println(ll.contains(450));
		System.out.println("===================");
		ll.element();
		System.out.println(ll.element());
		System.out.println("element result" +ll);
		System.out.println("===================");

		System.out.println(ll.offer(2000));
		System.out.println(ll);
		System.out.println(ll.offerFirst(400));
		System.out.println(ll);
		System.out.println("=====================");
		System.out.println(ll.peek());
		System.out.println("peek result" +ll);
		System.out.println("=============================");
		System.out.println(ll.peekFirst());
		System.out.println("peek first result" +ll);
		System.out.println(ll.peekLast());
		System.out.println("peek last result" +ll);
		System.out.println("===============================");
		System.out.println(ll.pop());
		System.out.println("pop result" +ll);
		System.out.println("=============================");
		System.out.println("poll result"+ll.poll());
		System.out.println(ll);
		System.out.println("=============================");
		ll.remove();
		System.out.println("remove result "+ll);
		System.out.println("=============================");
		ll.remove(5);
		System.out.println("remove "+ll);
		
		System.out.println("=============================");
		ll.size();
		System.out.println(ll.size());
		System.out.println("size result " +ll);
		System.out.println("=============================");
		ll.push(900);
		System.out.println("push resulr "+ll);
		
		
		
		
		
		}

}
