package count_words;

import java.util.Iterator;

public class TreeWordSet implements WordSet{
private int size;
private BST root;


	class BST {
		private Word word;
		private BST left = null;
		private BST right = null;

		public BST(Word word) {
			this.word = word;

		}

		private void add(Word word) {
			if (word.compareTo(this.word) < 0) {
				if (left == null) {
					left = new BST(word);
				} else {
					left.add(word);
				}
			} else if (word.compareTo(this.word) > 0) {
				if (right == null) {
					right = new BST(word);

				} else {
					right.add(word);
				}
			}
		}
		private boolean contains(Word word ) {
			if(word.compareTo(this.word)<0) {
				if( left == null ) 
					return false ;
				
				else 
					return left.contains(word);
				
			}
				else if(word.compareTo(this.word)>0) {
					if ( right==null ) 
						return false;
					
					else 
						return right.contains(word);
					
				
				
			}
			return true ;
		}

	}

	public TreeWordSet() {
		root = null;
	}

	@Override
	public Iterator<Word> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Word word) {
		if (root == null) {
			root = new BST(word);
		} else {
			root.add(word);
		}

	}

	@Override
	public boolean contains(Word word) {
		if( size==0) {
			return false;
		}
		else {
           return root.contains(word)	;		
		}
		
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
