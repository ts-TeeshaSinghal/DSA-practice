/**
 * MoveZerosToEnd
 */
public class MoveZerosToEnd {

    public static void main(String[] args) {
        int a[] = { 4, 5, 0, 1, 7, 0, 8, 0 };
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[count] = a[i];
                count++;
            }
        }
        for (int i = count; i < a.length; i++) {
            a[i] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}