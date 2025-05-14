class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        int temp=0;
        int l=0;
        for(int r=0;r<n;r++){
            temp+=nums[r];
            while(temp>=target){
                ans=Math.min(ans,r-l+1);
                temp-=nums[l];
                l++;
            }
        }
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;

        
    }
}