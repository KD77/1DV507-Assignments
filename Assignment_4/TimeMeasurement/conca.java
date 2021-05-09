package TimeMeasurement;

public class conca {
	 public static void main(String[] args){

	        String shortC = "";
	        String longC  = "";
	        long numOfShortConcat = 0;
	        long numOfLongConcat = 0;
	       
	        StringBuilder shortAppend = new StringBuilder();
	        StringBuilder longAppend = new StringBuilder();
	        long numOfShortAppend = 0;
	        long numOfLongAppend = 0;

	    
	        long time = System.nanoTime();
	        while (System.nanoTime() - time <= 1000000000) {
	            shortC = shortC + "n";
	            numOfShortConcat++;
	        }

	
	        time = System.nanoTime();
	        while (System.nanoTime() - time <= 1000000000) {
	            longC = longC + "IwishJavawasfunlikeJavaScript.mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
	                             
	            numOfLongConcat++;
	        }

	
	        time = System.nanoTime();
	        while (System.nanoTime() - time <= 1000000000) {
	            shortAppend.append("n").toString();
	            numOfShortAppend++;
	        }

	       
	        time = System.nanoTime();
	        while (System.nanoTime() - time <= 1000000000) {
	            longAppend.append("IwishJavawasfunlikeJavaScript.mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
	            longAppend.toString();
	           
	            numOfLongAppend++;
	        }

	        System.out.println("Short concatination : " + shortC.length());
	        System.out.println("Number of short concatenations: " + numOfShortConcat + "\n");

	        System.out.println("Long concatinatination : " + longC.length());
	        System.out.println("Number of long concatenations: " + numOfLongConcat + "\n");

	        System.out.println("Short append: " + shortAppend.length());
	        System.out.println("Number of short appends: " + numOfShortAppend + "\n");

	        System.out.println("Long append: " + longAppend.length());
	        System.out.println("Number of long appends: " + numOfLongAppend);
	    }

}
