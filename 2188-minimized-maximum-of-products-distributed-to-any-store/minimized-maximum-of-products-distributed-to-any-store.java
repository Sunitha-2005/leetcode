import java.util.*;

class Solution {
    
    public boolean isPossible(int[] quantities, int n, int k) {
        int m = quantities.length;
        for (int i = 0; i < m; i++) {
            int temp = quantities[i] / k;  
            if (quantities[i] % k != 0) {
                temp++;
            }

            n -= temp;  
            if (n < 0) {
                return false;  
            }
        }
        return true;  
    }

    public int minimizedMaximum(int n, int[] quantities) {
        int l = 1;  
        int r = Arrays.stream(quantities).max().orElse(0);  

        while (l <= r) {
            int mid = l + (r - l) / 2;  
            if (isPossible(quantities, n, mid)) {
                r = mid - 1;  
            } else {
                l = mid + 1;  
            }
        }
        return l;  
    }
}
