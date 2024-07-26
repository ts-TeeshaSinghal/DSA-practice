package Array;

import java.util.*;

public class ArrayBasics {
   static int  arrSum(int[] a,int n)
    {
        int sum=0;
        a[0]=23;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("enter the elements of array : ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println("before function call...\n");
        System.out.println("array elements are :\n");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
         int ans= arrSum(a,a.length);
         System.out.println("after function call...\n");
         for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
         System.out.println("\n" + ans);
       
    }
}
