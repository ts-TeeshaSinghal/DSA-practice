package patterns;

public class FullPyramidStar {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid
        for(int i = 1; i <= rows; i++) {
            for(int j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
