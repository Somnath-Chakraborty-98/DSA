import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] arr) {
            Arrays.sort(arr);

            List<List<Integer>> res = new ArrayList<List<Integer>>();

            for (int i = 0; i < arr.length - 2; i++) {

                if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) { // To avoid first pointer duplicate value

                    int low = i + 1;
                    int high = arr.length - 1;
                    int sum = 0 - arr[i]; // a+b+c=0; b+c=0-a;

                    while (low < high) {
                        if (arr[low] + arr[high] == sum) {
                            res.add(Arrays.asList(arr[i], arr[low], arr[high])); // Adding to the list

                            while (low < high && arr[low] == arr[low + 1])
                                low++; // finding last same value so that next is unique

                            while (low < high && arr[high] == arr[high - 1])
                                high--; // finding last same value so that next is unique

                            low++; // unique
                            high--; // unique
                        } else if (arr[low] + arr[high] < sum)
                            low++; // Increase low to increase overall sum

                        else
                            high--; // Decrease high to decrease overall sum
                    }

                }
            }

            return res;

        }
    }
}
