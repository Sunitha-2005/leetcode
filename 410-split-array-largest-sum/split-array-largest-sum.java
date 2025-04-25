class Solution {
    public boolean isPossible(int[] nums, int k, int mid) {
        int temp = 0;
        k--;  // We start with one subarray, so decrease k initially

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n > mid) {
                return false;
            }
            if (temp + n > mid) {
                k--;
                temp = 0;
            }
            temp += n;
            if (k < 0) {
                return false;
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        int l = 0;
        int r = (int) Math.pow(10, 9);  // Your original upper bound

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(nums, k, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
