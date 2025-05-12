class Solution {
     public static boolean func(HashMap<Character,Integer>hmp,HashMap<Character,Integer>hms){
        if(hms.size()!=hmp.size()){
            return false;
        }
        for(char key:hmp.keySet()){
            if(!hms.containsKey(key)){
                return false;
            }
           int a=hmp.get(key);
           int b=hms.get(key);
           if(a!=b){
              return false;
           }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer>hmp=new HashMap<>();
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            if(hmp.containsKey(ch)){
                int temp=hmp.get(ch);
                hmp.put(ch,temp+1);
            }
            else{
                hmp.put(ch,1);
            } 
        }
        ArrayList<Integer>ans=new ArrayList<>();
        int l=0;
        HashMap<Character,Integer>hms=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char ch1=s.charAt(r);
            if(!hms.containsKey(ch1)){
                hms.put(ch1,1);
            }
            else{
                int temp1=hms.get(ch1);
                hms.put(ch1,temp1+1);
            }
            if(r-l+1==p.length() && func(hmp,hms)){
                ans.add(l);
            }
            if(r-l+1==p.length()){
                int val=hms.get(s.charAt(l));
                hms.put(s.charAt(l),val-1);
                if(hms.get(s.charAt(l))==0){
                    hms.remove(s.charAt(l));
                }
                l++;
            }
        }
        return ans;
    }
}