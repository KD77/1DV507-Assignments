package count_words;

public class Word implements Comparable<Word> {

	
	 private String word;

	   public Word(String str) {
		   this.word= word;
		   word=str.toLowerCase();		   
	   }
	   public String toString() {
		   return word; 
		   }

	   /* Override Object methods */
	   public int hashCode() {
		   int hash = 0;
		   for( int i=0; i<word.length(); i++) {
			   char ch=word.charAt(i);
			   hash+=Character.getNumericValue(ch);
		   }
		   return hash;
	   }
	   public boolean equals(Object other) { 
		   if(word.equals(other)) {
			   return true;
		   }
		   return false;
	   }

	   /* Implement Comparable */
	   public int compareTo(Word w) { 
		   
	         return word.compareTo(w.word);
		   }

}
