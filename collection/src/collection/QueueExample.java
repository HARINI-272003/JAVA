package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();

		
		//Add elements
		for(int i=0;i<5;i++)
			q.add(i);
		
		//display contents of the queue
		System.out.println("Elements of queue "+q);
		
		//to remove the head of queue
		int removable=q.remove();
		System.out.println("Removed element "+removable);
		
		//to view the head of queue
		int head=q.peek();
		System.out.println("Head of Queue "+head);
		
		//rest all methods of collection
		
		//interface like size and contains
		//can be used with this implementation
		
		int size=q.size();
		System.out.println("Size of queue "+size);
	}

}
