class Solution {
    public boolean fun(String s,int k){
        HashSet<Character>hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hs.add(ch);
        }
        if(hs.size()==k){
            return true;
        }else{
            return false;
        }
    }
    public int countGoodSubstrings(String s) {
        int n=s.length();
        int ans=0;
        int k=3;
        for(int i=0;i<n-k+1;i++){
            boolean temp=fun(s.substring(i,i+k),k);
            if(temp){
                ans+=1;
            }
        }
        return ans;
        
    }
}