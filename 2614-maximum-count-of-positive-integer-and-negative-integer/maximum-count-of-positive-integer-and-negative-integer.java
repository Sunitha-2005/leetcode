class Solution {
    public static int leftMost(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = nums.length; 
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > target) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static int rightMost(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = nums.length; 
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public int maximumCount(int[] nums) {
        int negatives = rightMost(nums, 0);
        int positives = leftMost(nums, 0);
        int ans=Math.max(negatives,nums.length-positives);
        return ans;
    }
}

