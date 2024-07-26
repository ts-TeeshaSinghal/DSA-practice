package Array;

public class MaximumProductSubarray {
      //bruteforce...
    public static int maxProduct(int a[])
    {
        int maxPro=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
               int pro=1;
               for(int k=i;k<=j;k++)
               {
                  pro=pro*a[k];
               }
               maxPro=Math.max(pro,maxPro);
            }
        }
        return maxPro;
    }

    //optimized
    public static int maxProductKadanes(int a[])
    {
        // for(int i=0;i<a.length;i++)
        // {
        //     curpro=curpro*a[i];
        //     if(curpro==0)
        //     {
        //         curpro=1;
        //     }
        // }
        // for(int i=a.length-1;i>=0;i--)
        // {
        //     curpro=curpro*a[i];
        // }

        int lp=1;
        int rp=1;
        int ans=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                lp=1;
                rp=1;
            }
            lp=lp*a[i];
            rp=rp*a[a.length-1-i];
            ans=Math.max(ans, Math.max(rp,lp));
        }
        
        return ans;
        
    }
    
    
    public static void main(String[] args) {
        int[] a={2,3,-2,4};
       // int ans=maxProduct(a);
       int ans=maxProductKadanes(a);
        System.out.println(ans);
        
    }
    
}
