import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        int physics = sc.nextInt();
        int maths = sc.nextInt();
        int english = sc.nextInt();
        int hindi = sc.nextInt();
        int computer = sc.nextInt();
        int total=physics + maths + english + hindi + computer;
        System.out.println("total no.:" + total);
        System.out.println("average no.:" + (physics + maths + english + hindi + computer) / 5);

        if (total>150){
            System.out.println("you are pass");
        } else {
            System.out.println("you are fail");
        }
    }
}

