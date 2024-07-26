
public class BinarySearch {

    public static int binarySearching(int a[], int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 2, 5, 7, 8, 12 };
        int key = 7;
        int ans = binarySearching(a, key);
        System.out.println(ans);
    }
}
