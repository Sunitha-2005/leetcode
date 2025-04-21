class Solution {
    public boolean isPossible(int[] bloomDay, int m, int k, int day) {
        int took = 0;
        int made = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                took++;
                if (took == k) {
                    made++;
                    took = 0;
                }
            } else {
                took = 0;
            }
        }

        return made >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < m * k) {
            return -1;
        }

        int l = 1;
        int r = (int) 1e9;
        int answer = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (isPossible(bloomDay, m, k, mid)) {
                answer = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return answer;
    }
}
