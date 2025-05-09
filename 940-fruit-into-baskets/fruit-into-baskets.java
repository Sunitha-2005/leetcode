class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0;
        HashMap<Integer,Integer>hs=new HashMap<>();
        int ans=0;
        for(int r=0;r<n;r++) {
            int val=fruits[r];
            hs.put(val,hs.getOrDefault(val,0)+1);
            while(hs.size()>2){
                int lval=fruits[l];
                hs.put(lval,hs.get(lval)-1);
                if(hs.get(lval)==0){
                    hs.remove(lval);
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
       return ans;
    }
    
}