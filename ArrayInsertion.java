import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        // Initial array and its size
        int[] array = {31, 60, 5, 33, 200, 88, 73, 51};
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


    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static int[] insertIntoArray(int[] array, int size, int number, int position) {
        // Validate position
        if (position < 0 || position > size) {
            throw new IllegalArgumentException("Invalid position: " + position);
        }

        // Create a new array with extra space for the new element
        int[] newArray = new int[size + 1];

        // Copy elements before the position
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        // Insert the new number at the specified position
        newArray[position] = number;

        // Copy the remaining elements after the position
        for (int i = position; i < size; i++) {
            newArray[i + 1] = array[i];
        }

        return newArray;
    }

    public static int selectFromArray(int[] array, int index) {
        // Validate index
        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException("Invalid index: " + index);
        }

        return array[index];
    }
}

    