package Array;

import java.util.Arrays;

public class RepeatingAndMissing {

    public static int findNumbers(int a[])
    {
        //Arrays.sort(a);
      int  count=0;
          int reapNum=0;
          int missNum=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
            if(a[i]==a[j])
            {
                count++;
                reapNum=a[i];
            }
        }
            
        }
        return reapNum;
    }
    public static void main(String[] args) {
        int a[]={4,3,6,2,1,1};
       int ans= findNumbers(a);
       System.out.println(ans);
    }
    
}
