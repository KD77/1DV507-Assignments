package count_words;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IdentyfyWordsMain {
	private static File file;
	private static String words;
	private static String text;
	private static String readFile;
	public static void main(String [] args ) throws IOException{
		readFile="//Users/kaliddiriye/eclipse-workfast/Java/src/count_words/file.txt";
		read(readFile);
		
		
	}
	public static void read(String path) throws IOException {
		file=new File(path);
		Scanner	sc= new Scanner(file);
		
		while (sc.hasNext()) {
			text=sc.nextLine();
			
			for (int i=0; i<text.length(); i++) {
				char ch=text.charAt(i);
				if (Character.isLetter(ch) || Character.isWhitespace(ch)) {
					words= words + ch;
					
					
				}
			}
			
			
			
			
		}
		System.out.println();
		printFile();
		System.out.println(file.getParent()+ "/words.txt");
		sc.close();
		
		
	}
	public static void  printFile() throws IOException {
		File fil=new File(file.getParent() + "/words.txt");
		fil.createNewFile();
		PrintWriter writer=new PrintWriter(fil);
		writer.print(words);
		writer.close();
		
		
		
		
	}

}
