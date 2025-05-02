class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int temp=0;
        int sum=0;
        for(int i=cost.length-1;i>=0;i--){
            if(temp==2){
                temp=0;
            }else{
                sum=sum+cost[i];
                temp++;
            }
        }
        return sum;
        
    }
}