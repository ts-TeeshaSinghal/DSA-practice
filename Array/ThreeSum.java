
import java.util.*;

class ThreeSum {
  public static List<List<Integer>> findthreeSum(int[] nums) {
    Arrays.sort(nums);
    Set<List<Integer>> s = new HashSet<>();
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int j = i + 1;
      int k = nums.length - 1;
      while (j < k) {
        if (nums[i] + nums[j] + nums[k] == 0) {
          s.add(Arrays.asList(nums[i], nums[j], nums[k]));
          j++;
          k--;
        } else if (nums[i] + nums[j] + nums[k] > 0) {
          k--;
        } else {
          j++;
        }
      }
    }
    result.addAll(s);
    return result;

  }

  public static void main(String[] args) {
    int a[] = { -1, 0, 1, 2, -1, -4 };

    List<List<Integer>> ans = findthreeSum(a);
    for (int i = 0; i < ans.size(); i++) {
      System.out.println(ans.get(i));
    }

  }
}