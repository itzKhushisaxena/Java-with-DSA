import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {
        int[][] arrMatrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the value at index:" + i + "," + j);
                arrMatrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrMatrix[i][j] + " ");
//            }
//            System.out.println();
            }

        }
    }
}
