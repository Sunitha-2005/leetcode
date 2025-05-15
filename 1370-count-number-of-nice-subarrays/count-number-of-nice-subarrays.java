class Solution {
    public int atMostK(int[] nums,int k){
        int l=0;
        int ans=0;
        int temp=0;
        int n=nums.length;
        for(int r=0;r<n;r++){
            if(nums[r]%2==1){
                temp++;
            }
            while(temp>k){
                if(nums[l]%2==1){
                    temp--;
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
        
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int finalans=atMostK(nums,k)-atMostK(nums,k-1);
        return finalans;
    }
}