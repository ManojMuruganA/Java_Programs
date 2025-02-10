import bubblesort.BubbleSort;
import selectionsort.SelectionSort;
import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Bubble Sort
        System.out.println("Enter the number of elements for Bubble Sort:");
        int bubbleSize = scanner.nextInt();
        int[] bubbleArray = new int[bubbleSize];

        System.out.println("Enter the elements for Bubble Sort:");
        for (int i = 0; i < bubbleSize; i++) {
            bubbleArray[i] = scanner.nextInt();
        }

        // Perform Bubble Sort
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Original Array (for Bubble Sort): ");
        bubbleSort.displayArray(bubbleArray);
        bubbleSort.bubbleSort(bubbleArray);
        System.out.println("Sorted Array (Bubble Sort): ");
        bubbleSort.displayArray(bubbleArray);

        // Input for Selection Sort
        System.out.println("Enter the number of elements for Selection Sort:");
        int selectionSize = scanner.nextInt();
        int[] selectionArray = new int[selectionSize];

        System.out.println("Enter the elements for Selection Sort:");
        for (int i = 0; i < selectionSize; i++) {
            selectionArray[i] = scanner.nextInt();
        }

        // Perform Selection Sort
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("Original Array (for Selection Sort): ");
        selectionSort.displayArray(selectionArray);
        selectionSort.selectionSort(selectionArray);
        System.out.println("Sorted Array (Selection Sort): ");
        selectionSort.displayArray(selectionArray);

        scanner.close();
    }
}

