public class DSA3 {
    public static void main(String[] args) {
        int arr[]={20,30,40,10,50};
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];

        }
       int average=0;
        if (arr.length>0){
            average=sum/arr.length;
        }
        System.out.println("Sum of array element:" + sum);
        System.out.println("Average of array elements:" + average);
    }
}
