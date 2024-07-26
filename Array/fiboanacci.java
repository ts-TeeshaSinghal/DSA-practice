
public class fiboanacci {

    public static void printFibSeries(int n) {

        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b);
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printFibSeries(10);

    }

}
