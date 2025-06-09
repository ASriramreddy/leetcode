class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        // Pointer at end of nums1's actual elements
        int j = n - 1;        // Pointer at end of nums2
        int k = m + n - 1;    // Merge pointer at end of nums1's total capacity
        
        // Merge from the back to avoid overwriting
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        // If any elements remain in nums2, copy them over
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
