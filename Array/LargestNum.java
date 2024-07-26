
public class LargestNum {
    public static int largeElem(int a[]) {
        int max = Integer.MIN_VALUE;// -infinity
        int min = Integer.MAX_VALUE;// +infinity

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];

            }
            if (min > a[i]) {
                min = a[i];
            }

        }
        System.out.println("smallest element in array is : " + min);
        return max;
    }

    public static void main(String[] args) {
        int a[] = { 45, 67, 89, 120, 20 };
        int ans = largeElem(a);
        System.out.println("largest element in array is :" + ans);

    }

}
