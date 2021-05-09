package count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class WordCount2Main {
	public static void main(String []args) {
	HashSet<Word> hash=new HashSet<>();
	TreeSet<Word>set=new TreeSet<>();
	String text;
	
	
   Scanner sc=null;
try {
	sc = new Scanner(new File("/Users/kaliddiriye/eclipse-workfast/Java/src/count_words/words.txt"));
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   while(sc.hasNext()) {
	   text=sc.next();
	   Word word=new Word(text);
	   hash.add(word);
	   set.add(word);
	   
   }
   sc.close();
   
   System.out.println("Tree size "+ set.size());
   System.out.println("Hash size "+hash.size());
   
   System.out.println("Print the words in Alphabetical order\n");
   
   Iterator<Word> it=set.iterator();
   int count = 0;
   
   
   while(it.hasNext()) {
	   System.out.println(it.next()+" "+count++ );
	   
   }
	}

}
