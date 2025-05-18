class Solution {
    public int atMost(int[] nums,int k){
        int l=0;
        int temp=0;
        int ans=0;
        HashMap<Integer,Integer>hs=new HashMap<>();
        int n=nums.length;
        for(int r=0;r<n;r++){
            int val=nums[r];
            hs.put(val,hs.getOrDefault(val,0)+1);
            while(hs.size()>k){
                int lval=nums[l];
                hs.put(lval,hs.get(lval)-1);
                if(hs.get(lval)==0){
                    hs.remove(lval);
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
        
    }
}