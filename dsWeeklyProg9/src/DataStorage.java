import java.util.*;
public class DataStorage {

	public static int array1[] = new int[10000];
	public static int array2[] = new int[10000];
	public static int array3[] = new int[10000];
	
	Random randomNumber = new Random();
	
	
	public DataStorage() {
		
		for (int i = 0; i < array1.length; i++)
		{
			array1[i] = randomNumber.nextInt(1000);
		}
		
		for (int i = 0; i < array2.length; i++)
		{
			array2[i] = randomNumber.nextInt(1000);
		}
		
		for (int i = 0; i < array3.length; i++)
		{
			array3[i] = randomNumber.nextInt(1000);
		}
	}
	
	
	public void bubbleSort (int array[]) {
		
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		// Print sorted array
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + ", ");
		}
		
	}
	
	
	public void selectionSort (int array[]) {
		
		int temp = 0;
		for(int i = 0; i < array.length-1; i++) {
			int min = i;
			for(int j = i+1; j < array.length; j++) {
				if (array[j] < array[min])
				{
					min = j;
				}
				
				temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}
		}
		
		// Print sorted array
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + ", ");
		}
		
	}
	
	
	public void insertionSort (int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			int j = i-1;
			
		while (j >= 0 && array[j] > value) {
			array[j+1] = array[j];
			j=j-1;
		}
		array[j+1] = value;
		}
		
		// Print sorted array
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + ", ");
		}
		
	}
	
	
	
}
