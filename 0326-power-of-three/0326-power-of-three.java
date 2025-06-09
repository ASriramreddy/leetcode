class Solution {
    public boolean isPowerOfThree(int n) {
        // Check if n is positive and divides the largest power of 3 within the 32-bit integer range
        return n > 0 && 1162261467 % n == 0;
    }
}
