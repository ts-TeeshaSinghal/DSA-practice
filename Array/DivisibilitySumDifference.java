public class DivisibilitySumDifference {

    public static int differenceofSum(int n, int m) {

        int divSum = 0;
        int notDivSum = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                divSum = divSum + i;
            }
            if (i % n != 0) {
                notDivSum = notDivSum + i;
            }

        }

        return (notDivSum - divSum);
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 20;
        System.out.println(differenceofSum(n, m));

    }
}
