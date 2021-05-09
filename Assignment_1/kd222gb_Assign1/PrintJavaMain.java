package kd222gb_Assign1;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
public class PrintJavaMain {
	
	public static void main(String [] args) throws IOException { 
		
		printAllFiles ( "/Users/kaliddiriye/eclipse-workfast/Java 2/src" ); 
		
	}

	private static int depth=1, count=0,folders=0;
	
	
	public static void printAllFiles(String directory) throws IOException {
		File file = new File(directory);
		if (file.exists()) {
			System.out.println("Reading java files from directory: " + file);
			visSub(file);
		} else
			System.err.println("Can't find directory: " + file);
	}
	private static void visSub(File file) throws IOException {
		
		if(file.isDirectory()) {
			printDir(file);
			depth++;        
			File[] subs = file.listFiles();
			for( File f: subs) {
				if (checkJavaFile(f) == true) {

				printJavaFile(f);
			}
				visSub(f);
			}
			depth--;    
		}    
		
	}
	
	/* Print java files */
	private static void printJavaFile(File file) throws IOException {
		StringBuffer java = new StringBuffer();
		for (int i = 0; i < folders; i++)
			java.append(" ");
		System.out.println((++count) +" "+ java.toString() + file.getName() + " Lines = " + countLines(file) );
	}

	private static void printDir(File file) {  
		StringBuffer buf= new StringBuffer();
		for(int i=0; i<depth; i++)           
			buf.append(" ");
		System.out.println((++count)+ buf.toString()+ file.getName());
	}
	
	
	private static boolean checkJavaFile(File file) {
		String name = file.getName();
		char ch = '.';
		int dot = name.lastIndexOf(ch);
		if (dot != -1 && dot != 0) {
			String java = name.substring(dot);
			return java.equals(".java");
		}
		return false;
	}
	
	
	private static int countLines(File f) throws IOException {
		int line = 0;
		FileReader reader = new FileReader(f);
		LineNumberReader lineCounter = new LineNumberReader(reader);
		while (lineCounter.readLine() != null) {
			line++;
		}
		lineCounter.close();
		return line;
	}

}
