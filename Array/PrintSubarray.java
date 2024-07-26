
public class PrintSubarray {
    public static void subarr(int a[]) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++)

                {
                    sum = sum + a[k];
                    System.out.print(a[k] + " ");

                }
                System.out.println("sum is : " + sum);
                System.out.println();

                maxSum = Math.max(maxSum, sum);
                minSum = Math.min(maxSum, sum);

            }

        }
        System.out.println(maxSum);
        System.out.println(minSum);

    }

    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 10 };
        subarr(a);
    }
}
