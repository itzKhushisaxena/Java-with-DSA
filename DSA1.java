public class DSA1  {
    public static void main(String[] args) {
        int arr[]={13,25,55,34,20};
        int min=arr[0];
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] < min) {
                  min=arr[i];
            }
            if (arr[i] > max) {
                max=arr[i];
            }
        }
        System.out.println("Minimum element:" + min);
        System.out.println("Maximum element:" + max);
    }
}