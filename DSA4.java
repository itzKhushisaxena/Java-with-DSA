import java.util.Scanner;

public class DSA4 {
    public static int Inserelement(int[] arr, int size, int element, int pos) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return size;
        }
        arr[pos] = element;
        size++;
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the the value at index: " + i);
            arr[i] = sc.nextInt();


        }
    }
}
