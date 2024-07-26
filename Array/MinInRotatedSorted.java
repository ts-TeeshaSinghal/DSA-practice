package Array;

public class MinInRotatedSorted {
    public static int findMinElm(int a[])
    {
      
       int left=0;
       int right=a.length-1;
       while(left<=right)
       {
        int mid=(left+right)/2;
        if(mid>0 && a[mid-1]>a[mid])
        {
            return a[mid];
        } 
         if(a[left]>a[mid])
         {
           right=mid-1;
         }
         else if(a[mid]>a[right])
         {
            left=mid+1;
         }
         else
         {
            return a[left];
         }
        }
           return -1;
    }
    public static void main(String[] args) {
        int a[]={4,5,6,7,89,1,2};
        int ans=findMinElm(a);
        System.out.println(ans);
    }
}
