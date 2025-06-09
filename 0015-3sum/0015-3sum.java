import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort first to enable two-pointer strategy

        for (int i = 0; i < nums.length - 2; i++) {
            // If current number > 0, break—no possible triplets can sum to 0.
            if (nums[i] > 0) break;

            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;  // Increase sum
                } else if (sum > 0) {
                    right--;  // Decrease sum
                } else {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move left and skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Move right and skip duplicates
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // Move both pointers inward
                    left++;
                    right--;
                }
            }
        }
        return result;
    }
}
