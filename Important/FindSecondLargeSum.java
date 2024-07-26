// The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest  element from the even positions and second smallest from the odd position of given ‘arr’

// Assumption:

// All array elements are unique
// Treat the 0th position as even
// NOTE

// Return 0 if array is empty
// Return 0, if array length is 3 or less than 3
// Example

// Input

// arr:3 2 1 7 5 4

// Output

// 7

// Explanation

// Second largest among even position elements(1 3 5) is 3
// Second smallest among odd position element is 4
// Thus output is 3+4 = 7

import java.util.*;

public class FindSecondLargeSum {

    public static int LargeSmallSum(int a[]) {

        if (a.length == 0 || a.length <= 3) {
            return 0;
        }

        List<Integer> evenPositonElements = new ArrayList<>();
        List<Integer> oddPositonElements = new ArrayList<>();
        evenPositonElements.add(a[0]);

        for (int i = 1; i < a.length; i++) {
            if (i % 2 == 0) {
                evenPositonElements.add(a[i]);
            } else {
                oddPositonElements.add(a[i]);
            }
        }

        Collections.sort(evenPositonElements);
        Collections.sort(oddPositonElements);

        return evenPositonElements.get(evenPositonElements.size() - 2)
                + oddPositonElements.get(1);
    }

    public static void main(String[] args) {
        int a[] = { 1, 8, 0, 2, 3, 5, 6 };
        System.out.println(LargeSmallSum(a));

    }

}
