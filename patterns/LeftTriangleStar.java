
import java.util.Scanner;

public class LeftTriangleStar {
    public static void main(String args[]) {
        int row;
        System.out.println("enter number of rows : ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = row - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
