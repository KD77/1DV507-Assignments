package kd222gb_assig_2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class QueueJunitTest {

	@Test
	void testSize() {
		LinkedQueue qu=new LinkedQueue();
		
		Object []arr= {};
		Object output=qu.size();
		assertEquals(0, output);
				
				
		Object []arr1= {1,2,3,4,5,6,};
		Object res =qu.size();
		assertEquals(6, arr1.length);
		
	for( int i=0; i<1000; i++) {
		qu.enqueue(i);
	}		
	    assertEquals(1000,1000);
	
			
		
	}

	@Test
	void testFirst() {
		
		LinkedQueue qu=new LinkedQueue();
		for(int i=2; i<10; i++) {
			qu.enqueue(i);
		}
		assertEquals(2, qu.first());
		
		
		LinkedQueue qu1=new LinkedQueue();
		qu1.enqueue(0);
		assertEquals(0, qu1.first());
	}
	@Test
	void testLast() {
		LinkedQueue qu=new LinkedQueue();
		
		for(int i=0;i<=100;i++) {
		qu.enqueue(i);
		}
				assertEquals(100, qu.last());

	}
	@Test
	void testIsEmpty() {
		Object [] arr= {};
		LinkedQueue qu=new LinkedQueue();
		boolean output=qu.isEmpty();
		assertTrue(true);
		
		Object []arr1= {1,2,3,4,5,6,};
		boolean res=qu.isEmpty();
		assertFalse(false);
	}
	@Test
	void testEnqueue () {
		LinkedQueue qu=new LinkedQueue();
	for(int i=0; i<=0; i++) {
		qu.enqueue(i);
		
	}
	assertEquals(0, 0);
	
	for( int i=0; i <10000; i++) {
		qu.enqueue(i);
		
	}
	assertEquals(10000, 10000);
	}
	@Test
	void testDeque() {
		LinkedQueue qu=new LinkedQueue();
		for(int i=0; i<100; i++) {
			qu.enqueue(i);
		}
		assertEquals(0, qu.dequeue());
	}
	
	@Test
	void testIteraror() {
		
		LinkedQueue qu=new LinkedQueue();
		Iterator<Object> queue=qu.iterator();
		
		for( int i=0; i<100; i++) {
			qu.enqueue(i);
		
		while(queue.hasNext()) {
			assertEquals(i, queue.next());
			
		}
	  }
		
	}
	
	
}
