package TimeMeasurement;

import java.util.Comparator;
import java.util.Random;

public class ExerciseSorgingAlg {
	public static void main(String[] args) {

		int[] num = new int[1000];
		System.out.println("Insertion sorted integers: " + randomIntgers(num));
		System.out.println("Merge Sorted integers: " + randIntgers(num));

		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String a1, String a2) {
				return a1.compareTo(a2);
			}
		};

		String[] list = new String[1000];
		System.out.println("Insertion Sorted strings: " + randomString(list, c));
	}

	public static int randomIntgers(int[] arr) {
		int counter = 0;
		boolean lessThanOneSecond = true;
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100000);
		}

		long time = System.nanoTime();
		while (lessThanOneSecond) {

			insertionSort(arr);
			counter++;

			if (System.nanoTime() - time <= 1000000000) {
				lessThanOneSecond = true;
			} else {
				lessThanOneSecond = false;
			}

			for (int j = 0; j < arr.length; j++) {
				arr[j] = rand.nextInt(100000);
			}
		}
		return counter * 1000;
	}

	public static int randIntgers(int[] arr) {
		int counter = 0;
		boolean lessThanOneSecond = true;
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100000);
		}

		long time = System.nanoTime();
		while (lessThanOneSecond) {

			mergeSort(arr);
			counter++;

			if (System.nanoTime() - time <= 1000000000) {
				lessThanOneSecond = true;
			} else {
				lessThanOneSecond = false;
			}

			for (int j = 0; j < arr.length; j++) {
				arr[j] = rand.nextInt(100000);
			}
		}
		return counter * 1000;
	}

	public static int randomString(String[] arr, Comparator<String> c) {
		int counter = 0;
		boolean lessThanOneSecond = true;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = getRandomString();
		}

		long time = System.nanoTime();
		while (lessThanOneSecond) {

			insertionSort(arr, c);
			counter++;

			if (System.nanoTime() - time <= 1000000000) {
				lessThanOneSecond = true;
			} else {
				lessThanOneSecond = false;
			}

			for (int j = 0; j < arr.length; j++) {
				arr[j] = getRandomString();
			}
		}
		return counter * 1000;
	}

	public static String getRandomString() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder str = new StringBuilder();
		Random rand = new Random();
		while (str.length() < 11) {
			int index = rand.nextInt(chars.length());
			str.append(chars.charAt(index));
		}
		return str.toString();
	}

	public static int[] insertionSort(int[] in) {
		for (int i = 0; i < in.length; i++) {
			int next = in[i];
			int j = i;
			while (j > 0 && in[j - 1] > next) {
				in[j] = in[j - 1];
				j--;
			}
			in[j] = next;

		}

		return in;

	}

	public static int[] mergeSort(int[] in) {
	
		if (in.length <= 1) {
			return in;
		}
		int[] first = new int[in.length / 2];
		int[] second = new int[in.length - first.length];

		for (int i = 0; i < first.length; i++) {
			first[i] = in[i];

		}
		for (int i = 0; i < second.length; i++) {
			second[i] = in[first.length + i];

		}
		mergeSort(first);
		mergeSort(second);

		merge(first, second, in);
		return in;

	}

	private static void merge(int[] first, int[] second, int[] in) {
		int iFirst = 0;
		int iSecond = 0;
		int j = 0;

		while (iFirst < first.length && iSecond < second.length) {
			if (first[iFirst] < second[iSecond]) {
				in[j] = first[iFirst];
				iFirst++;
			} else {
				in[j] = second[iSecond];
				iSecond++;

			}
			j++;
		}
		while (iFirst < first.length) {

			in[j] = first[iFirst];
			iFirst++;
			j++;

		}
		while (iSecond < second.length) {
			in[j] = second[iSecond];
			iSecond++;
			j++;

		}

	}


	public static String[] insertionSort(String[] in, Comparator<String> c) {
		String[] newArray = new String[in.length];
		System.arraycopy(in, 0, newArray, 0, in.length);
		for (int i = 0; i < newArray.length; i++) {
			String next = newArray[i];
			int j = i;
			while (j > 0 && c.compare(newArray[j - 1], next) > 0) {
				newArray[j] = newArray[j - 1];
				j = j - 1;
			}
			newArray[j] = next;

		}
		return newArray;

	}

}
