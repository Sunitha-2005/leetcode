class Solution {
    // Function to find the leftmost (first) index of the target
    public static int leftmost(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int result = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                result = mid;
                r = mid - 1;  // Keep searching on the left side
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    // Function to find the rightmost (last) index of the target
    public static int rightmost(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int result = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                result = mid;
                l = mid + 1;  // Keep searching on the right side
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    // Main function to return the range
    public int[] searchRange(int[] nums, int target) {
        int lm = leftmost(nums, target);
        int rm = rightmost(nums, target);
        return new int[] {lm, rm};
    }
}
