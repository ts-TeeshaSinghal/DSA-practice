
public class MaxSubArraySum {
    // Bruteforce approach
    public static int findMaxSumSubArr(int a[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + a[k];

                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    // Prefix Array Apporach

    public static int prefixArr(int a[]) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        int[] prefixArr = new int[a.length];
        prefixArr[0] = a[0];
        for (int i = 1; i < prefixArr.length; i++) {
            prefixArr[i] = a[i] + prefixArr[i - 1];
        }
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {

                curSum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i - 1];

            }
            if (curSum > maxSum) {
                maxSum = curSum;
            }
        }
        return maxSum;
    }

    // Kadane's algorithm

    public static int kadanesubarrSum(int a[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < a.length; i++) {
            currentSum += a[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // int a[] = { 1, -2, 6, -1, 3 };
        int b[] = { 4, 6, 3, 7 };
        // int ans = findMaxSumSubArr(a);
        // int ans=prefixArr(a);
        int ans = kadanesubarrSum(b);
        System.out.println(ans);
    }
}
