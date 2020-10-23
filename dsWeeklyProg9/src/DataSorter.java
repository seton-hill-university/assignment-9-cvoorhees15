import java.io.IOException;
import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
public class DataSorter extends DataStorage {

	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub

		DataStorage dataSort = new DataStorage();
		
		System.out.println("Sorted Arrays:");
		
		
		System.out.println("\nBubble Sort:");
		// Start timer
		Instant startBubbleSort = Instant.now();
		// Sort
		dataSort.bubbleSort(array1);
		// End timer
		Instant finishBubbleSort = Instant.now();
		long BubbleSortTime = Duration.between(startBubbleSort, finishBubbleSort).toMillis();  //in millis
		System.out.println("\n" + BubbleSortTime + " milliseconds elapsed.");
		
		
		System.out.println("\nSelection Sort:");
		// Start timer
		Instant startSelectionSort = Instant.now();
		// Sort
		dataSort.selectionSort(array2);
		// End timer
		Instant finishSelectionSort = Instant.now();
		long SelectionSortTime = Duration.between(startSelectionSort, finishSelectionSort).toMillis(); //in millis
		System.out.println("\n" + SelectionSortTime + " milliseconds elapsed.");
		
		
		System.out.println("\nInsertion Sort:");
		// Start timer
		Instant startInsertionSort = Instant.now();
		//Sort
		dataSort.insertionSort(array3);
		// End timer
		Instant finishInsertionSort = Instant.now();
		long InsertionSortTime = Duration.between(startInsertionSort, finishInsertionSort).toMillis(); //in millis
		System.out.println("\n" + InsertionSortTime + " milliseconds elapsed.");
				
		
		
		
		
	}

}
