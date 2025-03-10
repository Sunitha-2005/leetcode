import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
    
        for (int val : hashMap.values()) {
            sum += (val * (val - 1)) / 2;  
        }
        
        return sum;
    }
}
