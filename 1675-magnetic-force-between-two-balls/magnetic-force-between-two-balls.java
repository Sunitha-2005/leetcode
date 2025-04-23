class Solution {
    public boolean isPossible(int[] position, int m, int k) {
        int count = 1; 
        int prev = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - prev >= k) {
                count++;
                prev = position[i];
            }
            if (count >= m) {
                return true;
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1;
        int r = position[position.length - 1] - position[0];
        int result = 0;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(position, m, mid)) {
                result = mid;     // Store this distance
                l = mid + 1;      // Try for a larger minimum distance
            } else {
                r = mid - 1;      // Try smaller distances
            }
        }
        return result;
    }
}
