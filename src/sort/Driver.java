package sort;

import java.util.Arrays;
import java.util.Random;

public class Driver {
	public static void main(String[] args) {
		Sort sort = new Sort();
		float[] numArray = sort.generateRandomArray(10);
		System.out.println(Arrays.toString(numArray));
		
		//Sorting via bubble sort
		numArray = sort.selectionSort(numArray);
		System.out.println("Finished Array:");
		System.out.println(Arrays.toString(numArray));
	}
	
}
