package jUnitTesting;

import java.util.Arrays;
import java.util.Comparator;

import org.hamcrest.core.Is;

public class SortingAlgorithms {
	

public static int[] insertionSort(int[] in) {
		for(int i=0; i<in.length; i++) {
			 int next=in[i];
			 int j=i;
			 while(j>0 && in[j-1]>next) {
				 in[j]=in[j-1];
				 j--;
			 }
			 in[j]=next;
			 
		}
		
		return in; 

	}

	public static int [] mergeSort(int[] in) {
		// VG Exercise
		if(in.length<=1) {
			return in;
		}
		int[] first=new int [in.length/2];
		int []second=new int [in.length-first.length];
		
		for (int i=0;i<first.length;i++) {
			first[i]=in[i];
			
		}
		for(int i=0; i<second.length;i++) {
			second[i]=in[first.length + i];
			
		}
		mergeSort(first);
		mergeSort(second);
		
		merge(first, second, in);
		return in ;
		
	}
	private static void merge(int []first, int [] second, int[]in) {
		int iFirst=0;
		int iSecond=0;
		int j=0;
		
		while(iFirst<first.length && iSecond<second.length) {
			if(first[iFirst]<second[iSecond]) {
				in [j]=first[iFirst];
			     iFirst++;
			     }
			else {
				in[j]=second[iSecond];
				iSecond++;
				
			}
			j++;
		}
		while (iFirst<first.length) {
			
				in[j]=first[iFirst];
				iFirst++;
				j++;
				
			
			
		}
		while(iSecond<second.length) {
			in [j]=second[iSecond];
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

	public String[] mergeSort(String[] in) {

		String[] arr = new String[in.length];
		System.arraycopy(in, 0, arr, 0, in.length);
		String[] first;
		String[] second;
		int count = 0;
		int iFirst = 0;
		int iSecond = 0;
		System.arraycopy(in, 0, arr, 0, in.length);
		if (in.length <= 1) {
			return in;
		}

		else {
			first = new String[in.length / 2];
			second = new String[in.length - first.length];

			System.arraycopy(in, 0, first, 0, first.length);
			System.arraycopy(in, first.length, second, 0, second.length);

		}
		mergeSort(first);
		mergeSort(second);

		while (iFirst < first.length && iSecond < second.length) {
			if (first[iFirst].compareTo(second[iSecond]) <= 0) {
				arr[count] = second[iFirst];
				iFirst++;
			} else {
				arr[count] = second[iSecond];
				iSecond++;
			}
			count++;
		}

		while (iFirst < first.length) {
			arr[count] = second[iFirst];
			iFirst++;
			count++;
		}

		while (iSecond < second.length) {
			arr[count] = second[iSecond];
			iSecond++;
			count++;
		}
		return arr;

	}

}
