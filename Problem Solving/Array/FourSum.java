import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            ArrayList<List<Integer>> res = new ArrayList<List<Integer>>(); // The result List to be stored of type List

            if (nums == null || nums.length == 0)
                return res;

            int n = nums.length;

            Arrays.sort(nums);

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int target_2 = target - nums[i] - nums[j]; // The Remaining Sum to be Found

                    int left = j + 1; // First Pointer for Two Sum
                    int right = n - 1; // Second Pointer for two sum

                    while (left < right) { // Iterate and find the Two_Sum
                        int two_sum = nums[left] + nums[right];

                        if (two_sum < target_2)
                            left++; // If sum is low increase the left pointer to increase the total sum as it is
                                    // sorted

                        else if (two_sum > target_2)
                            right--; // If sum is greater decrease the right pointer to decrease the total sum as it
                                     // is sorted

                        else {
                            List<Integer> quad = new ArrayList(); // Store single quads

                            quad.add(nums[i]);
                            quad.add(nums[j]);
                            quad.add(nums[left]);
                            quad.add(nums[right]);
                            res.add(quad);

                            while (left < right && nums[left] == quad.get(2))
                                ++left; // Move the left forward where it's diffrent from it's last value to get unique
                                        // value as i and j are same

                            while (left < right && nums[right] == quad.get(3))
                                --right; //// Move the right backward where it's diffrent from it's last value to get
                                         //// unique value as i and j are same
                        }
                    }

                    while (j + 1 < n && nums[j + 1] == nums[j])
                        ++j; // increase j only if next j is same as the for loop will also increase it by 1

                }

                while (i + 1 < n && nums[i + 1] == nums[i])
                    ++i; //// increase i only if next i is same as the for loop will also increase it by
                         //// 1
            }
            return res;

        }
    }
}
