import java.util.Scanner;

public class DSA11 {
    static void display(int[]arr){
        System.out.println(arr.toString());
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The element at"+i+"is:"+arr[i]);
        }
    }
    static void BinarySearch(int[]arr,int start,int end,int data){
        int mid=(start+end)/2;
        if(arr[mid]==data){
            System.out.println("Element found at position:"+mid);
            return;
        } else if (arr[mid]>data) {
            end=(start+end)/2;
            BinarySearch(arr,start,end,data);
            return;
        } else if (arr[mid]<data) {
            start=(start+end)/2;
            BinarySearch(arr, start, end, data);
            return;
        }
    }
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at position: ");
            arr[i]=sc.nextInt();
        }
        System.out.println(arr.toString());
        display(arr);
int data1=44;
BinarySearch(arr,0,arr.length-1,data1);
    }
}
