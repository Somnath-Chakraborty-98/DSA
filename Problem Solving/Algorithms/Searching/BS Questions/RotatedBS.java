public class RotatedBS {

    static int solution(int[] arr, int target) {
        int pivot = findPivot(arr);

        if (pivot == -1) {
            // not rotated do basic BS
            return search(arr, target, 0, arr.length - 1);
        }

        if (arr[pivot] == target)
            return pivot;

        if (target >= arr[0]) {
            return search(arr, target, 0, pivot - 1);
        }

        return search(arr, target, pivot + 1, arr.length - 1);
    }

    static int search(int[] arr, int target, int start, int end) {
        if (target > arr[end])
            return -1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }

        return -1;
    }

    static int findPivot(int[] arr) {

        int start = 0, mid = 0;
        int end = arr.length - 1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid < end && arr[mid + 1] < arr[mid])
                return mid;
            if (mid > start && arr[mid - 1] > arr[mid])
                return mid - 1;
            if (arr[mid] <= arr[start])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 9, 3, 4 };
        int target = 3;
        System.out.println(RotatedBS.solution(arr, target));
    }
}
