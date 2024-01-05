import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 2, 8, 1, 7,25,9,6,20,4};

        // Using Arrays.sort() to sort the array
        Arrays.sort(numbers);

        // Displaying the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}