class Solution {
    public String minWindow(String s, String t) {
        String result="";
        if(t.length()>s.length()){
            return result;
        }
        int[] tcount=new int[128];
        for(char ch:t.toCharArray()){
            tcount[ch]++;
        }
        char[] sChars=s.toCharArray();
        int left=0,right=0;
        int found=0,tofind=t.length();
        int minWindowLength=Integer.MAX_VALUE;
        while(right<s.length()){
            char ch=sChars[right];
            tcount[ch]--;
            if(tcount[ch]>=0){
                found++;
            }
            while(found==tofind){
                if(minWindowLength>(right-left+1)){
                    minWindowLength=right-left+1;
                    result=s.substring(left,right+1);
                }
                tcount[sChars[left]]++;
                if(tcount[sChars[left]]>0){
                    found--;
                }
                left++;

            }
            right++;
        }
        return result;
        
    }
}