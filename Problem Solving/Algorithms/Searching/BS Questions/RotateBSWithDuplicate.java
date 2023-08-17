public class RotateBSWithDuplicate {
    static int solution(int[] arr, int target) {
        int pivot = findPivotWithDuplicates(arr);

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

    static int findPivotWithDuplicates(int[] arr) {

        int start = 0, mid = 0;
        int end = arr.length - 1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid < end && arr[mid + 1] < arr[mid])
                return mid;
            if (mid > start && arr[mid - 1] > arr[mid])
                return mid - 1;

            // if elements at mid, start and end are same skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // Check if start is pivot
                if (arr[start] > arr[start + 1])
                    return start;
                start++;
                // Check if end is pivot
                if (arr[end] < arr[end - 1])
                    return end - 1;
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]))
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 9, 9, 3, 3, 4, 5 };
        int target = 3;
        System.out.println(RotateBSWithDuplicate.solution(arr, target));
    }
}
