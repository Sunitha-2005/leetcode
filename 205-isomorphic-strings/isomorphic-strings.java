import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If lengths are not equal, they cannot be isomorphic.
        }
        
        HashMap<Character, Character> hashMap = new HashMap<>();
        HashMap<Character, Character> res = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
           
            if (hashMap.containsKey(ch1)) {
                if (hashMap.get(ch1) != ch2) {
                    return false; 
                }
            } else {
                
                hashMap.put(ch1, ch2);
            }

           
            if (res.containsKey(ch2)) {
               
                if (res.get(ch2) != ch1) {
                    return false; // The reverse mapping is incorrect
                }
            } else {
               
                res.put(ch2, ch1);
            }
        }

        return true; 
    }
}
