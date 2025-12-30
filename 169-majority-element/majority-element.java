class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        int ans=-1;
        int n=nums.length/2;
        for(int n1:hm.keySet()){
            int val1=hm.get(n1);
            if(val1>n){
                ans=n1;
                break;
            }
        }
        return ans;
    }
}