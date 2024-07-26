package Array;

import java.util.Arrays;

public class KthLargestEle {

    public static int findKthLargestElement(int a[],int k)
    {
        Arrays.sort(a);
        return a[(a.length-k)];

    }
    public static void main(String[] args) {
        int a[]={3,2,1,5,6,4};
        int k=2;
       int ans= findKthLargestElement(a,k);
       System.out.println(ans);
        
    }
}
