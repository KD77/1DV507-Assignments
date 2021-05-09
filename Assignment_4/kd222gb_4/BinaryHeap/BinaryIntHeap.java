package kd222gb_4.BinaryHeap;



public class BinaryIntHeap implements BinaryHeap<Integer> {
	private static final int INTIAL_SIZE = 10;
	private Integer heap[];
	private int size;
	
	public BinaryIntHeap() {
		heap = new Integer[INTIAL_SIZE]; // never using the first 0th element of the array
		size = 0;
	}

	@Override
	public void insert(Integer t) {
		// TODO Auto-generated method stub
		 if(size == heap.length -1) {
			 resize();
		 }
		
		int pos = size++;
		
		while(pos > 1 && t.compareTo(heap[pos/2]) > 0)
		{
			heap[pos] = heap[pos/2];
			pos = pos/2;
		}
		heap[pos] = t;
		
		
	}

	@Override
	public Integer pullHighest() {
		// TODO Auto-generated method stub
		int result = heap[1];
		heap[1] = heap[size];
		heap[size] = null;
		size--;
		
		return result;
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		return heap.length == 1;
	}
	public String toString() {
		String str = "";
		for(int i = 1; i < size; i++) {
			str += heap[i] + " ";
		}
		return str;
	}
	
	private void resize() {
		Integer[] tmp = new Integer[2*heap.length];
		System.arraycopy(heap,1,tmp,1,heap.length-1); 
		heap = tmp;
	}
		
	
}
