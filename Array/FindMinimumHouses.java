
// Problem Description :
// The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

// Note:

// Return -1 if the array is null
// Return 0 if the total amount of food from all houses is not sufficient for all the rats.
// values lie within the integer range.
// Example:

// Input:

// r: 7
// unit: 2
// n: 8
// arr: 2 8 3 5 7 4 1 2
// Output: 4
import java.util.Scanner;

public class FindMinimumHouses {

    public static int solve(int r, int unit, int arr[], int n) {

        int res = r * unit;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            count++;
            if (sum >= res) {
                break;
            }
        }
        if (sum < res) {
            return 0;
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rats");
        int r = sc.nextInt();
        System.out.println("enter number of units");
        int unit = sc.nextInt();
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements in array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("minimum number of houses to provide enough food for rats are : ");
        System.out.println(solve(r, unit, arr, n));
        sc.close();
    }
}