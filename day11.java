public class day11 {
    public static void main(String[] args) {
        int[] arr1={6,7,8,9,6};
        int[] arr2={1,8,9};

        int[] arr=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length+i]=arr2[i];
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
