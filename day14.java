import java.util.Arrays;

public class day14 {
    public static void main(String[] args) {
        int[] arr1={4,5,6};
        int[] arr2={1,2,3};
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
        int index=Arrays.binarySearch(arr1,5);
        System.out.println(index);
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
