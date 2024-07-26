package Array;

public class PairWithSumInRotatedSortedArray {
    public static  boolean findPair(int a[],int x)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==x)
                {
                    return true;
                  
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={11, 15, 6, 8, 9, 10};
        int x = 126;
       boolean ans= findPair(a,x);
       System.out.println(ans);
    }
}
