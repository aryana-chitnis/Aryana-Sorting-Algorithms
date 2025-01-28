public class Main {
int[] arr = {1,5,3,6,77,8,2,333};
public static void sortAscending(final int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int minimum = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[minimum] > arr[j]) {
                minimum = j;
            }
        }

        if (minimum != i) {
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }
    }

}
public static void main(String[] args) {
    System.out.print(arr.sortAscending());
}

}