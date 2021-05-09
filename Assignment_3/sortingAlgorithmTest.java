package jUnitTesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.Comparator;

class sortingAlgorithmTest {
	@Test
	void intSortTest() {
		SortingAlgorithms sort=new SortingAlgorithms();
		int [] unSorted = {100,54,22,56,-200};
		int [] sorted = {-200,22,54,56,100};
	
		int [] insertionSorted = sort.insertionSort(unSorted);
		int [] mergedSorted = sort.mergeSort(unSorted);
		
		//sorting both of the methods 
		
		assertArrayEquals(sorted, insertionSorted);
		assertArrayEquals(sorted, mergedSorted);
		
		
	}
	@Test
	void stringSortTest() {
		SortingAlgorithms sort=new SortingAlgorithms();
		Comparator<String> comper =  (e1, e2) -> e2.compareTo(e1);
		String [] unSorted = {"Jon", "Emilia", "Ariya"};
		String [] sorted = {"Ariya","Emilia","Jon"};
		String [] newSorted = sort.insertionSort(unSorted, comper);
		assertArrayEquals(newSorted,sorted);
		
		
	}
	
	

}
