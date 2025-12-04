import java.util.Arrays;

public class Program13 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 3}; // Initialize an integer array

        System.out.println("Original array: " + Arrays.toString(numbers));
        Arrays.sort(numbers); // Sort the array in ascending order

        System.out.println("Sorted array (ascending): " + Arrays.toString(numbers));
    }

}
