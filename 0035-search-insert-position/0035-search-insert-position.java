class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;   // Note: right = nums.length for insert position logic
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        // When loop ends, left == right is the correct insert position
        return left;
    }
}
