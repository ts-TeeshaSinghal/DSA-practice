
public class PairsInArray {

    public static void pairInArrBruteForce(int a[]) {
        int totalPairs = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                System.out.print("( " + a[i] + " ," + a[j] + " )" + " ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println(totalPairs);
    }

    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10 };
        pairInArrBruteForce(a);

    }
}
