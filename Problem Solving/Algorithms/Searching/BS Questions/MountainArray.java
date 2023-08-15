public class MountainArray {

    static int solution(int[] arr) {
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
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 4, 7, 5, 2 };
        System.out.println(MountainArray.solution(arr));
    }
}
