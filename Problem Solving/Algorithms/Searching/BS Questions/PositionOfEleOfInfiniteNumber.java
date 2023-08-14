public class PositionOfEleOfInfiniteNumber {

    static int solution(int[] nums, int target) {
        // start = 0 and end = 1, now double the size start = 1 and end = 2

        // Find range
        int start = 0, end = 1, mid = 0, temp;
        while (nums[end] < target) {
            // start = end + 1
            temp = end + 1;
            // end = end + box size * 2
            end = end + ((end - start + 1) * 2);
            start = temp;
        }

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else
                return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 12, 13, 15, 16, 19, 20, 24, 26, 29, 31, 33 };
        int target = 15;
        int output = PositionOfEleOfInfiniteNumber.solution(nums, target);
        System.out.println(output);
    }
}
