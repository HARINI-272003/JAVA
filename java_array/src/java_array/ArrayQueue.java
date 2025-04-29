package java_array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayQueue {

	public static void main(String[] args) {
		
		Deque <String> arrayDeque = new ArrayDeque<String>();
		arrayDeque.add("A");
		arrayDeque.add("R");
		arrayDeque.add("I");
		arrayDeque.add("N");
		
		arrayDeque.offerFirst("H");
		arrayDeque.offerFirst("S");
		
		arrayDeque.offerLast("I");
		
		Iterator <String> itr = arrayDeque.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("after poll");
		
	
	}
	
	

}
