import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for (int i = 0; i < 2 * num; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
