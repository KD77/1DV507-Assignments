package count_words;

import java.util.Iterator;

public class HashWordSet implements WordSet {
	private int size;
	private Node [] buckets;
	
	public class Node{
		Node next=null;
		Word w;
		
		public Node(Word w) {
			this.w=w;
		}
		
	
		
	}
	
	 public HashWordSet(int bucketsLength) {
		buckets= new Node[bucketsLength];
		size=0;
		
		
	}

	@Override
	public Iterator<Word> iterator() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Word word) {
		int pos = getBucketsNumber(word);
		Node node=buckets[pos];
		while (node!=null) {
			if(node.w.equals(word))
			return;
			
			else
				node=node.next;
		}
         node=new Node(word);
         node.next=buckets[pos];
         buckets[pos]=node;
         size++;
         
         // ma be add rehash method
		
		
		
	}

	@Override
	public boolean contains(Word word) {
		int pos=getBucketsNumber(word);
		Node node=buckets[pos];
		while(node!=null) {
			if(node.w.equals(word))
				return true;
			else 
				node=node.next;
			
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	private int getBucketsNumber(Word word) {
		int hc=word.hashCode();
		if(hc<0)
			hc=-hc;
		return hc%buckets.length;
	}

}
