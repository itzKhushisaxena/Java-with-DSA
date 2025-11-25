import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no.");
        int num1=sc.nextInt();
        System.out.println("Enter the second no.");
        int num2=sc.nextInt();
        System.out.println("Enter the third mo.");
        int num3=sc.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println(num1+"is the largest number");
        } else if (num3>num1&&num3>num2) {
            System.out.println(num3+"is largest number");

        }else {
            System.out.println(num2+"is largest number");
        }
    }
}
