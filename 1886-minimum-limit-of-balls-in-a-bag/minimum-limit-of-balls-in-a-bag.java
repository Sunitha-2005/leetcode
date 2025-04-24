class Solution {
    public boolean isPossible(int[] nums,int maxOperation,int m){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int p=nums[i];
            int q=p/m;
            if(p%m!=0){
                q++;
            }
            q--;
            maxOperation-=q;
            if(maxOperation<0){
                return false;
            }

        }
        return true;
    }
    
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(nums,maxOperations,mid)){
              r=mid-1;

            }else{
               l=mid+1;
            }
        }
        return l;
        
    }
}