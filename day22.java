import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for (int i = 0; i <=10 ; i++) {

            System.out.println(num + " X " + i + " = " + (i * num));


        }
    }
}
