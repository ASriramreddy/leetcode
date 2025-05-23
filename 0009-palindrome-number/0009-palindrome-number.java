public class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (unless the number is 0) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;

        // Reverse only half of the number
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // For even-length numbers, x == reversed
        // For odd-length numbers, x == reversed / 10
        return x == reversed || x == reversed / 10;
    }
}
