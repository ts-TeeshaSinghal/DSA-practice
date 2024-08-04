class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;  // Avoid overflow

            if (target == nums[mid]) {
                return mid;
            }

            // Check if the left side is sorted
            if (nums[s] <= nums[mid]) {
                // Target is in the left sorted part
                if (target >= nums[s] && target < nums[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                // Right side must be sorted
                // Target is in the right sorted part
                if (target > nums[mid] && target <= nums[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
