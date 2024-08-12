
public class RemoveDupliacates {
    public static int removeduplacte(int a[]) {
        int i = 0;
        for (int j = 1; j < a.length; j++) {
            if (a[i] < a[j]) {
                int temp = a[i + 1];
                a[i + 1] = a[j];
                a[j] = temp;
                i++;

            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int a[] = { 0, 1, 1, 1, 2, 2, 3 };
        System.out.println(removeduplacte(a));
    }
}
