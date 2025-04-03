class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer>hashset=new HashSet<>();
        int dup=-1;
        for(int i=0;i<nums.length;i++){
            if(!hashset.contains(nums[i])){
                hashset.add(nums[i]);
            }else{
                dup=nums[i];
            }

        }
        int mis=-1;
        for(int i=1;i<=nums.length;i++){
            if(!hashset.contains(i)){
                mis=i;
            }
        }
        int ans[]={dup,mis};
        return ans;  
    }
}