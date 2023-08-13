import java.util.Arrays;

public class FindFirstAndLastOccurance {

    static int[] solution1(int[] nums, int target) {

        int start = 0, end = nums.length - 1;
        if (target > nums[end] || target < nums[start])
            return new int[] { -1, -1 };

        while (start <= end) {
            if (nums[start] < target)
                start++;
            else if (nums[end] > target)
                end--;

            if (nums[start] == target && nums[end] == target)
                return new int[] { start, end };
        }

        return new int[] { -1, -1 };
    }

    static int[] solution2(int[] nums, int target) {
        int start = 0, mid = 0, expectedMid = -1;
        int end = nums.length - 1;
        int startPost = -1, endPost = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;

            if (nums[mid] == target) {
                expectedMid = mid;
                end = mid - 1;
            }
        }
        startPost = expectedMid;

        start = 0;
        end = nums.length - 1;
        expectedMid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;

            if (nums[mid] == target) {
                expectedMid = mid;
                start = mid + 1;
            }
        }
        endPost = expectedMid;

        return new int[] { startPost, endPost };
    }

    public static void main(String[] args) {
        int[] nums = { 0, 3, 3, 4, 7, 7, 7, 9, 9, 9 };
        int target = 7;
        int[] ans1 = FindFirstAndLastOccurance.solution1(nums, target);
        System.out.println(Arrays.toString(ans1));

        int[] ans2 = FindFirstAndLastOccurance.solution2(nums, target);
        System.out.println(Arrays.toString(ans2));
    }
}
