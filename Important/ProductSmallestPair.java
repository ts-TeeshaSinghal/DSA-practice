/* The function accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair

NOTE

Return -1 if array is empty or if n<2
Return 0, if no such pairs found
All computed values lie within integer range
Example

Input

sum:9

size of Arr = 7

Arr:5 2 4 3 9 7 1

Output

2

Explanation

Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2 */
public class ProductSmallestPair {
    public static int findproduct(int a[], int sum) {

        if (a.length < 2) {
            return -1;
        }
        int check;
        // for (int i = 0; i < a.length; i++) {
        // for (int j = i + 1; j < a.length; j++) {
        // if (a[i] > a[j]) {
        // int temp = a[i];
        // a[i] = a[j];
        // a[j] = temp;
        // }
        // }
        // }
        // check = a[0] + a[1];
        // if (check <= sum) {
        // return a[0] * a[1];
        // }
        // without nested loops..

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < firstMin) {
                secondMin = firstMin;
                firstMin = a[i];
            } else if (a[i] < secondMin) {
                secondMin = a[i];
            }
        }
        check = firstMin + secondMin;
        if (check <= sum) {
            return firstMin * secondMin;
        } else
            return 0;
    }

    public static void main(String[] args) {
        int a[] = { 5, 2, 4, 3, 9, 7, 1 };
        int sum = 9;
        System.out.println(findproduct(a, sum));
    }
}