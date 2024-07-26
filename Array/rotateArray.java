
public class rotateArray {
    public static void rotate(int a[]) {
        int last = a[a.length - 1];

        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = last;

    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        rotate(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
