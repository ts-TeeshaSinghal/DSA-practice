package Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean checkDuplicate(int a[])
    {
        Set<Integer> set=new HashSet<>();
        for(int num:a)
        {
            if(set.contains(num))
            {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
       boolean ans= checkDuplicate(a);
       System.out.println(ans);
    }
}
