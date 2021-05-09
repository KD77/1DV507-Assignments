package kd222gb_Assign1;

public class PrintRecusive {
	public static void main(String[] args) {
		String str = "Hello Everyone!";

		print(str, 0);
		System.out.println(); // Line break
		printReverse(str, 0);

	}

	public static void print(String str, int pos) {
		if (pos != str.length()) {
			System.out.print(str.charAt(pos));
			print(str, pos + 1);
		}

		else
			System.out.println();

	}

	public static void printReverse(String str, int pos) {
		if (pos == str.length() - 1)
			System.out.println("");
		// else if(str.length()<=1)
		// System.out.println(str);

		else

			printReverse(str, pos + 1);
		System.out.print(str.charAt(pos) + "");

	}

}
