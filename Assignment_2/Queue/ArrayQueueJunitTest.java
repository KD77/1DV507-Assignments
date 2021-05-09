package kd222gb_assig_2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class ArrayQueueJunitTest {

	@Test
	void testSize() {
		
			circularArrayQueue cq=new circularArrayQueue();
			
			Object []arr= {};
			Object output=cq.size();
			assertEquals(0, output);
					
					
			Object []arr1= {1,2,3,4,5,6,};
			Object res =cq.size();
			assertEquals(6, arr1.length);
			
		for( int i=0; i<1000; i++) {
			cq.enqueue(i);
		}		
		    assertEquals(1000,1000);
		
				
			
		
		
	}
	@Test
	void testFirst() {
		circularArrayQueue cq=new circularArrayQueue();
	
		for(int i=2; i<10; i++) {
			cq.enqueue(i);
		}
		assertEquals(2, cq.first());
		
		
		circularArrayQueue cq1=new circularArrayQueue();
		cq1.enqueue(0);
		assertEquals(0, cq1.first());
	}
	
	@Test
	void testIsEmpty() {
		Object [] arr= {};
		circularArrayQueue cq=new circularArrayQueue();
		boolean output=cq.isEmpty();
		assertTrue(true);
		
		Object []arr1= {1,2,3,4,5,6,};
		boolean res=cq.isEmpty();
		assertFalse(false);
	}
	@Test
	void testEnqueue () {
		circularArrayQueue cq=new circularArrayQueue();
	for(int i=0; i<=0; i++) {
		cq.enqueue(i);
		
	}
	assertEquals(0, 0);
	
	for( int i=0; i <10000; i++) {
		cq.enqueue(i);
		
	}
	assertEquals(10000, 10000);
	}
	@Test
	void testDeque() {
		circularArrayQueue cq=new circularArrayQueue();
		for(int i=0; i<100; i++) {
			cq.enqueue(i);
		}
		assertEquals(0, cq.dequeue());
	}
	@Test
	void testIteraror() {
		circularArrayQueue cq=new circularArrayQueue();
		
		Iterator<Object> queue=cq.iterator();
		
		for( int i=0; i<100; i++) {
			cq.enqueue(i);
		
		while(queue.hasNext()) {
			assertEquals(i, queue.next());
			
		}
	  }
	}

}
