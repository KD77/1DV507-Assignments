package kd222gb_assig_2;

import java.util.Iterator;

import kd222gb_assig_2.LinkedQueue.LinkQueueIterator;

public class LinkedQueueMain {

	public static void main(String[] args) {
		LinkedQueue qu=new LinkedQueue();
		for(int i=0;i<10;i++) {
			qu.enqueue(i);
			
		}
		System.out.println("Elements in the queue"+"\n"+qu.toString());
			System.out.println("Size of the queue "+qu.size());
			System.out.println("First element "+ qu.first());
			System.out.println("Last element "+ qu.last());
			System.out.println("Removing first "+qu.dequeue());
			System.out.println("Elements in the queue"+"\n"+qu.toString());
			System.out.println("Removing first "+qu.dequeue());
			System.out.println("Removing first "+qu.dequeue());
			System.out.println("Elements in the queue"+"\n"+qu.toString());
			System.out.println("size of the queue "+qu.size());

		
			Iterator it =qu.iterator();
            while (it.hasNext()) {
            	System.out.print(" "+it.next());
            }
//            System.out.println();
//            System.out.println("Elements in the queue"+"\n"+qu.toString());
//            System.out.println("size of the queue "+qu.size());
//            System.out.println("removing first: "+qu.dequeue());
//            System.out.println("Elements in the queue"+"\n"+qu.toString());
//            System.out.println("size of the queue "+qu.size());
	}

}
