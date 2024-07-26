
import java.util.HashMap;

public class TwoSum {
    // Bruteforce...
    public static void targetSum(int a[], int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (target == a[i] + a[j]) {
                    System.out.println(a[i] + " ," + a[j]);
                }
            }
        }
    }

    // Optimized..
    public static int[] findTwoSum(int a[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int comp = target - a[i];
            if (map.containsKey(comp)) {
                return new int[] { map.get(comp), i };
            }

            map.put(a[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int a[] = { 3, 2, 10, 11, 7, 15 };
        int target = 21;
        // targetSum(a,target);
        int ans[] = findTwoSum(a, target);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
