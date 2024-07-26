package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChoclateDistribution {
    public static int findMinDiff(ArrayList<Integer> a, int m, int n) {
        Collections.sort(a);
        int mindiff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1<n; i++) {
            mindiff = Math.min(mindiff, a.get(i + m - 1) - a.get(i));
        }
        return mindiff;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        int m = 5;
        int n = a.size();
        int ans = findMinDiff(a, m, n);
        System.out.println(ans);
    }
}
