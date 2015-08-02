package sort;

import java.util.Arrays;
import java.util.Random;

public class Sort {
	static Random random = new Random();
	
	//WORKS
	public float[] bubbleSort(float[] numArray){
		boolean swapped;
		float temp = 0;
		
		System.out.println("Starting Array:");
		System.out.println(Arrays.toString(numArray));
		
		//bubble sorting method
		do{
			swapped = false;
			for(int i = 0; i < numArray.length - 1; i++){
				if(numArray[i] > numArray[i+1]){
					temp = numArray[i];
					numArray[i] = numArray[i+1];
					numArray[i+1] = temp;
					swapped = true;
				}
			}
		}while(swapped == true);
		
		return numArray;
	}
	
	//WORKS
	public float[] selectionSort(float[] numArray){
		float min;
		float temp;
		int index;
		
		//outer loop. This loop will hold the index at which the future min values will be swapped.
		for(int i = 0; i < numArray.length - 1; i++){
			index = i;
			//inner loop. This loop will iterate through the array and record the index of the lowest value.
			for(int j = i + 1; j < numArray.length; j++){
				if(numArray[j] < numArray[index]){
					index = j;
				}
			}
			
			//at the end of the run, swap the values.
			min = numArray[index];
			numArray[index] = numArray[i];
			numArray[i] = min;
			
		}
		return numArray;
	}
	
	private static float generateRand(int min, int max){
		int randomNum = random.nextInt((max - min) + 1) + min;
		return randomNum;
	}
	
	public float[] generateRandomArray(int size){
		float[] array;
		array = new float[size];
		
		for(int i = 0; i < size; i++){
			array[i] = generateRand(0, 100);
		}
		return array;
	}
}
