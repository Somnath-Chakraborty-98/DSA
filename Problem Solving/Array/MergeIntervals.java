import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    class Solution {
        public int[][] merge(int[][] arr) {
            
            List<int[]> res = new ArrayList<>();
            
            if(arr.length == 0 || arr== null) return arr;
            
            Arrays.sort(arr, (a,b) -> a[0] - b[0]);
            
            int start = arr[0][0];
            int end = arr[0][0];
            
            for(int i=0;i<arr.length;i++){
                
                if(arr[i][0] <= end) end=Math.max(end,arr[i][1]);
                
                else {
                    res.add(new int[]{start, end});
                    start = arr[i][0];
                    end = arr[i][1];
                }
            }
            
            res.add(new int[] {start,end});
            return res.toArray(new int[0][]);
        }
    }
}
