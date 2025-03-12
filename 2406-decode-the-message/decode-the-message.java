import java.util.HashMap;

class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        int temp = 97;
        
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (ch != ' ' && !hashMap.containsKey(ch)) {
                hashMap.put(ch, (char) temp);  
                temp++;  
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);  
            if (ch != ' ') {
                char val = hashMap.get(ch);
                ans.append(val);
            } else {
                ans.append(' ');
            }
        }

        return ans.toString();  
    }
}
