
import java.util.*;

public class LinearSearch {
    public static int seacrhElement(int a[], int key) {
        int idx = -1;
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                return i;

            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] a = { 34, 56, 12, 78 };
        int key = 56;
        int ans = seacrhElement(a, key);
        // System.out.println(ans);
        if (ans == -1) {
            System.out.println(key + " is not found ");
        } else {
            System.out.println(key + " is found at index :" + ans);
        }

    }
}
