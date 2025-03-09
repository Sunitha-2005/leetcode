import java.util.HashSet;

class Solution {
    public int sumOfSquareOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + (digit * digit);
            n = n / 10;  
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();  

        while (n != 1) {
            if (seen.contains(n)) {
                return false;  
            }
            seen.add(n); 
            n = sumOfSquareOfDigits(n);  
        }

        return true;  
    }

}
