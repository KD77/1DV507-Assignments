package kd222gb_4.BinaryHeap;

import jUnitTesting.BinaryIntHeap;

public class BinaryIntHeapMain {
 public static void main(String[] args) {
		
		BinaryIntHeap Binheap = new BinaryIntHeap();
		
		System.out.println("Is the heap empty: "+Binheap.isEmpty());
		int insertElement = 0;
		for(int i = 1; i < 24; i++) {
			insertElement = (int) (Math.random() * 25) + 1;
			Binheap.insert(insertElement);	
		}
		System.out.println("The heap is: "+Binheap.toString());
		System.out.println("Highest priority element: " + Binheap.pullHighest());
		System.out.println("The heap is: "+Binheap.toString());
	}


}
