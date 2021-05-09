package kd222gb_4.BinaryHeap;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarHeapTest {
	private static int test_count = 0;

    @BeforeEach
    public void setup(){
        test_count++;
        System.out.println("Test " + test_count);
    }

   
    @Test
    public void testSize(){
        BinaryIntHeap heap = build();
        assertEquals(6, heap.size());
    
       
    }

    @Test
    public void testInsert(){
        BinaryIntHeap heap = build();
        heap.insert(50);
        assertEquals(7, heap.size());
        
    }

    private BinaryIntHeap build(){
        BinaryIntHeap heap = new BinaryIntHeap();
        heap.insert(70);
        heap.insert(10);
        heap.insert(5);
        heap.insert(17);
        heap.insert(14);
        heap.insert(3);
        return heap;
    }

}
