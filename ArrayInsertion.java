import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        // Initial array and its size
        int[] array = {4, 2, 5, 1};
        int size = array.length;

        System.out.println("Original array: " + Arrays.toString(array));

        // Perform selection sort
        selectionSort(array);
        System.out.println("Array after selection sort: " + Arrays.toString(array));

        // Insert a number
        int numberToInsert = 3;
        int position = 2; // Position is zero-based index

        // Perform insertion
        array = insertIntoArray(array, size, numberToInsert, position);

        System.out.println("Array after insertion: " + Arrays.toString(array));

        // Select a number
        int indexToSelect = 3; // Zero-based index
        int selectedNumber = selectFromArray(array, indexToSelect);
        System.out.println("Selected number at index " + indexToSelect + ": " + selectedNumber);
    }

    