class Solution {
    public boolean isPossible(int[] weights, int days, int k) {
        int temp = 0;
        for (int i = 0; i < weights.length; i++) {
            int val = weights[i];
            if (val > k) {
                return false;
            }
            if (temp + val > k) {
                days--;
                temp = 0;
            }
            temp += val;
            if (days == 0) {
                return false;
            }
        }
        return true;
    }

    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;
        for (int w : weights) {
            l = Math.max(l, w); // Minimum capacity = heaviest package
            r += w;             // Maximum capacity = sum of all packages
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(weights, days, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}
