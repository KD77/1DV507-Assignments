package kd222gb_assig_2;

import java.util.Iterator;
import java.util.NoSuchElementException;

import jUnitTesting.Queue;

public class LinkedQueue implements Queue{
	private int size;
	private Node head=null;
	private Node tail=null;
	
	public LinkedQueue() {
		size=0;
		
	}
	private class Node{
		private Object data;
		private Node next;


	

	
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return head==null;
	}

	@Override
	public void enqueue(Object element) {
		Node node=new Node();
		if (isEmpty()==true ) {
			Node node1=new Node();
			node1.data=element;
			head=node1;
			tail=head;
			
		}
		else {
			Node node1 = new Node();
			node1.data=element;
			tail.next=node1;
			tail=tail.next;
		}
		size++;
		
	}

	@Override
	public Object dequeue() {
		if(isEmpty()==true) {throw new NoSuchElementException();
		}
	 Object data=head.data;
	 head=head.next;
	 size--;
	
		return data;
	}

	@Override
	public Object first() {
		if(head==null) {throw new  NoSuchElementException();}
		return head.data;
	}

	@Override
	public Object last() {
		if (tail==null) { throw new NoSuchElementException();}
		return tail.data;
	}
	 public String toString() {
		 StringBuilder buf =new StringBuilder();
		 buf.append("[");
		 Node node=new Node();
		 node=head;
		 while(node!=null) {
			 buf.append(" "+node.data);
			 node=node.next;
		 }
		 buf.append("]");
		 return buf.toString();
	 }

	@Override
	public Iterator<Object> iterator() {

		return new LinkQueueIterator();
	}
public class LinkQueueIterator implements Iterator{
    private Node position;
    public LinkQueueIterator() {
    	position =null;
    }
	@Override
	public boolean hasNext() {
		if (position==null) {
			return head!=null;
			}
		
	else {
		
		return position.next!=null;
	}
	}
	@Override
	public Object next() {
		if (!hasNext()) { throw new NoSuchElementException();
		
		}
		if(position==null) {
			position=head;
			
		}
		else {
			position=position.next;
		}
		
		return position.data;
	}
	
}
}
