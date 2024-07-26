
public class selection {
    public static void selectionSort(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[idx]) {
                    idx = j;

                }
            }
            int temp = a[i];
            a[i] = a[idx];
            a[idx] = temp;
        }
    }

    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 6, 2, 1, 9 };
        selectionSort(a);
        print(a);
    }
}
