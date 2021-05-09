package kd222gb_assig_2;

import java.util.Iterator;
import java.util.NoSuchElementException;

import jUnitTesting.Queue;



public class circularArrayQueue implements Queue{
	private Object [] data;
	private int head;
	private int tail;
	private int size;

	public circularArrayQueue() {
		final int INITIAL_SIZE=10;
		data=new Object[INITIAL_SIZE];
		head=0;
		tail=0;
		size=0;
	}
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return size==0;
	}

	@Override
	public void enqueue(Object element) {
		growArray();
		size++;
		data[tail]=element;
		tail=(tail+1)%data.length;
		
	}

	@Override
	public Object dequeue() {
		if (size==0) {
			throw new NoSuchElementException();
		}
		
		Object dequeued=data[head];
		head=(head+1)%data.length;
		size-- ;
		
		return dequeued;
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return data[head];
	}

	@Override
	public Object last() {
		// TODO Auto-generated method stub
		return data[tail];
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new ArrayQueueIterator();
	}
	private void growArray() {
		if(size==data.length) {
			Object[] newData=new Object[2*data.length];
          for (int i=0; i< data.length;i++) {
        	  newData[i]=data[(head+i)% data.length];
          }
          data=newData;
          head=0;
          tail=size;
          
		}
		
	}
	 public String toString() {
		 StringBuilder buf=new StringBuilder();
		 buf.append("[");
		 for(int i=0; i<size; i++) {
			 buf.append(data[i]+" ");
		 }
		 buf.append("]");
		 return buf.toString();
	 }
	
	public class ArrayQueueIterator implements Iterator{
 private int totNum;
		@Override
		public boolean hasNext() {
		
			return totNum<size;
		}

		@Override
		public Object next() {
			
			return data[totNum++];
		}
		
	}

}
