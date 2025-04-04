import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i}; // Return the two indices
            }

            numMap.put(nums[i], i); // Store the current number and index
        }

        return new int[]{}; // This will never execute since exactly one solution is guaranteed
    }
}
