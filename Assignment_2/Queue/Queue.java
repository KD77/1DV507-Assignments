package kd222gb_assig_2;

import java.util.Iterator;

public interface Queue {
	     
	  public int size();                     
	   public boolean isEmpty();              
	   public void enqueue(Object element); 
	   public Object dequeue();              
	   public Object first();                  
	   public Object last();                 
	   public String toString();             
	   public Iterator<Object> iterator();

}
