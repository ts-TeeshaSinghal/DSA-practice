package Array;

public class ProductOfArrayExceptItself {
    public static int[] ProductOfArray(int a[])
    {
        int n=a.length;
        int left[]=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++)
        {
            left[i]=left[i-1]*a[i-1];
        }
        int right[]=new int[n];
        right[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]*a[i+1];
        }
        int[] ans= new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=left[i]*right[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={-2,0,-1};
       int ans[]= ProductOfArray(a);
       for(int num:ans)
       {
        System.out.println(num);
       }
    }
}
