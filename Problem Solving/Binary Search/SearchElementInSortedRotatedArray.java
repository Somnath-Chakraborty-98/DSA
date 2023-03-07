class SearchElementInSortedRotatedArray {

    static int LinearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    static int BinarySearch(int arr[], int target) {
        int low = 0, high = arr.length - 1; // <---step 1

        while (low <= high) { // <--- step 2
            int mid = (low + high) >> 1; // <----step 3
            if (arr[mid] == target)
                return mid; // <---step 4

            if (arr[low] <= arr[mid]) { // <---step 5
                if (arr[low] <= target && arr[mid] >= target)
                    high = mid - 1; // <---step 6
                else
                    low = mid + 1; // <---step 7
            } else { // <---step 7
                if (arr[mid] <= target && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1; // <---step 8
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 3;
        System.out.println("The index in which the number is present is " + BinarySearch(arr, target));
    }
}