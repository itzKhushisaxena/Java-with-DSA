import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = sc.nextInt();

        int sumEven = 0;


        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                sumEven += i;
            }
        }

        System.out.println("The sum of even numbers between 1 and " + n + " is: " + sumEven);
    }
}
