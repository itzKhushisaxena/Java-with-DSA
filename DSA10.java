import java.util.Scanner;

public class DSA10 {
    static void display(int[]arr){
        System.out.println(arr.toString());
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The element at"+i+"is:"+arr[i]);
        }
    }
    static void LinearSearch(int data,int[]arr){
        for (int i = 0; i <=arr.length ; i++) {
            if (arr[i]==data){
                System.out.println("Linear Search is completed");
                System.out.println("data is found");
                break;
        }

        }
    }
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at position: ");
            arr[i]=sc.nextInt();
        }
        System.out.println(arr.toString());
        display(arr);
        int data1=5;
        LinearSearch(5, arr);
    }
}
