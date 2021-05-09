package kd222gb_assig_2;

import java.util.Iterator;

public class circularArrayMain {

	public static void main(String[] args) {
		circularArrayQueue cq=new circularArrayQueue();
		for(int i=0;i<10;i++) {
			cq.enqueue(i);
		}
		System.out.println("Elements in the queue"+"\n"+cq.toString());
			System.out.println("size of the queue "+cq.size());
			System.out.println("first element "+ cq.first());
			System.out.println("removing first "+cq.dequeue());
			System.out.println("Elements in the queue"+"\n"+cq.toString());
			System.out.println("removing first "+cq.dequeue());
			System.out.println("removing first "+cq.dequeue());
			System.out.println("Elements in the queue"+"\n"+cq.toString());

			System.out.println("size "+cq.size());
			Iterator it =cq.iterator();
            while (it.hasNext()) {
            	System.out.print(" "+it.next());
            }

	}

}
