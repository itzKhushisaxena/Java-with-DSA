import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no.");
        int num1=sc.nextInt();
        System.out.println("Enter second no.");
        int num2=sc.nextInt();
        System.out.println("The sum is:"+(num1+num2));
        System.out.println("The difference is:"+(num1-num2));
        System.out.println("The product is:"+(num1*num2));
        System.out.println("The quotient is:"+(num1/num2));
    }
}
