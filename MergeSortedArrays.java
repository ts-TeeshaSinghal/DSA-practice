import java.util.Arrays;

public class MergeSortedArrays {

    public static void merge(int a[], int b[]) {
        int i = a.length - b.length - 1;
        int j = b.length - 1;
        int x = a.length - 1;

        while (j >= 0 && i >= 0) {
            if (a[i] <= b[j]) {
                a[x] = b[j];
                j--;
                x--;
            } else {
                a[x] = a[i];
                x--;
                i--;

            }
        }
        while (j >= 0) {
            a[x] = b[i];
            j--;
            x--;

        }

    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 0, 0, 0 };
        int b[] = { 2, 5, 6 };
        merge(a, b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
