public class ceiling {
    static int solution(int[] arr, int target) {
        int start = 0, mid = 0;
        int end = arr.length - 1;
        if (target > arr[end])
            return -1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }

        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 8, 9 };
        int target = 10;

        int res = ceiling.solution(arr, target);

        System.out.println(arr[res]);
    }
}
