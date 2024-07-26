public class BoundedDiffCount {

    public static int findCount(int a[], int num, int diff) {

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i] - num) <= diff) {
                count++;
            }

        }
        if (count == 0) {
            return -1;
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = { 12, 3, 56, 77, 13, };
        int num = 13;
        int diff = 1;
        System.out.println(findCount(a, num, diff));
    }
}
