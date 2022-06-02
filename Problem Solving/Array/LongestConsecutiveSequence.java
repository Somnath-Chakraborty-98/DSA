import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    class Solution {
        public int longestConsecutive(int[] arr) {
            if(arr == null || arr.length==0) return 0;
            Arrays.sort(arr);
            int len=1;
            int max_len=0;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]+1 == arr[i+1]) len++;
                
                else if(arr[i] == arr[i+1]) continue;
                
                else{
                    if(len>max_len) max_len=len;
                    len=1;
                }
            }
            
            if(len > max_len) return len;
            else return max_len;
        }
    }


    class Solution2 {
        public int longestConsecutive(int[] arr) {
            if(arr == null || arr.length==0) return 0;
            
            Set<Integer> set= new HashSet<>();
            int len=1;
            int maxLen=0;
            
            for(int i=0;i<arr.length;i++){
                set.add(arr[i]);
            }
            
            for(int i=0;i<arr.length;i++){
                if(set.contains(arr[i]-1)) continue;
                
                else if(set.contains(arr[i]+1)){
                    int j=1;
                   while(set.contains(arr[i]+j)) {
                       len++;
                       j++;
                   }
                         if(len>maxLen) maxLen=len;
                         len=1;
                }
            }
            
            if(len > maxLen) return len;
            else return maxLen;
        }
    }



    class Solution3sameas2 {
        public int longestConsecutive(int[] arr) {
            if(arr == null || arr.length==0) return 0;
            
            Set<Integer> set= new HashSet<>();
            int len=1;
            int maxLen=0;
            
            for(int i=0;i<arr.length;i++){
                set.add(arr[i]);
            }
            
            for(int i=0;i<arr.length;i++){
                if(!set.contains(arr[i]-1)){
                    len = 1;
                    int curValue = 1;
                    
                    while(set.contains(arr[i]+curValue)){
                        curValue++;
                        len++;
                    }
                    if(len > maxLen) maxLen=len;
                }
            }
            
            if(len > maxLen) return len;
            else return maxLen;
        }
    }
    
}
