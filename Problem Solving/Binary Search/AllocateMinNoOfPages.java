import java.util.*;

public class AllocateMinNoOfPages {

    static boolean isPossible(ArrayList<Integer> arr, int pages, int students) {
        int cnt = 0;
        int sumAllocated = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (sumAllocated + arr.get(i) > pages) {
                cnt++;
                sumAllocated = arr.get(i);
                if (sumAllocated > pages)
                    return false;
            } else {
                sumAllocated += arr.get(i);
            }
        }
        if (cnt < students)
            return true;
        return false;
    }

    public static int books(ArrayList<Integer> arr, int B) {
        if (B > arr.size())
            return -1;
        int low = arr.get(0);
        int high = 0;
        for (int i = 0; i < arr.size(); i++) {
            high = high + arr.get(i);
            low = Math.min(low, arr.get(i));
        }
        int res = -1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            // cout << low << " " << high << " " << mid << endl;
            if (isPossible(arr, mid, B)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // return res -> this is also correct
        return low;
    }

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(34);
        arr.add(67);
        arr.add(90);
        int B = 2;
        System.out.println("Minimum Possible Number is " + books(arr, B));
    }
}
