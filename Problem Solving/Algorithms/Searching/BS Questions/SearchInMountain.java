public class SearchInMountain {
    static int solution(int[] arr, int target) {
        int start = 0, mid = 0;
        int end = arr.length - 1;

        while (start < end) {
            mid = start + (end - start) / 2;

            if (arr[mid + 1] < arr[mid]) // you are in decreasing part of array, it maybe the ans
                end = mid; // this is why end != mid - 1
            else // you are in ascending part of the array
                start = mid + 1; // because we kniow that mid + 1 element > mid, hence we ignore mid
        }

        // in the end start == end and pointing to largest niumber because of two checks
        // above
        // start and end are always trying to find max element
        int peakIndex = end;

        // Find in first half
        int ans = -1;
        start = 0;
        ans = OrderAgnosticBS(arr, target, start, end);

        if (ans == -1) {
            // Find in second half
            start = peakIndex + 1; // because peak index in alredy searched in first half
            end = arr.length - 1;
            ans = OrderAgnosticBS(arr, target, start, end);
        }

        return ans;
    }

    static int OrderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == arr[mid])
                return mid;

            if (isAsc) {
                if (target < arr[mid])
                    end = mid - 1;
                else if (target > arr[mid])
                    start = mid + 1;
            } else {
                if (target > arr[mid])
                    end = mid - 1;
                else if (target < arr[mid])
                    start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 4, 7, 5, 2 };
        int target = 5;
        System.out.println(SearchInMountain.solution(arr, target));
    }
}
