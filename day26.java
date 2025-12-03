import java.util.Scanner;

public class Program9 {
    public static boolean isPrime(int num) {
        boolean b1 = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                b1 = true;
                return b1;
            }
        }
        return b1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();


        if (isPrime(num)) {
            System.out.println("number is not prime");
        } else {
            System.out.println("number is prime");

        }
    }
}
