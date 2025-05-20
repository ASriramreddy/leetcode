public class Solution {
    public int divide(int dividend, int divisor) {
        // Constants to handle overflow
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;

        // Handle overflow
        if (dividend == INT_MIN && divisor == -1) {
            return INT_MAX;
        }

        // Convert both numbers to long to handle edge cases and take absolute values
        long lDividend = Math.abs((long) dividend);
        long lDivisor = Math.abs((long) divisor);

        int result = 0;

        // Perform division using bit manipulation
        while (lDividend >= lDivisor) {
            long temp = lDivisor, multiple = 1;
            while (lDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            lDividend -= temp;
            result += multiple;
        }

        // Determine the sign of the result
        if ((dividend < 0) ^ (divisor < 0)) {
            result = -result;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.divide(10, 3));    // Output: 3
        System.out.println(sol.divide(7, -3));    // Output: -2
        System.out.println(sol.divide(-2147483648, -1)); // Output: 2147483647
    }
}
