import java.util.Arrays;

public class removeDuplicates {
    class Solution {
        public int removeDuplicates(int[] arr) {
            int k=0;
            
            for(int i=0;i<arr.length-1;i++){
                if(arr[i] == arr[i+1]) {
                    k++;
                    arr[i]=101;
                }
            }
            Arrays.sort(arr);
            return arr.length-k;
            
        }
    }


    class Solution2 {
        public int removeDuplicates(int[] arr) {
            int i=0,j=1;
            
            while(i<arr.length && j<arr.length){
                if(arr[i] == arr[j]){
                    j++;
                } else{
                    i++;
                    arr[i]=arr[j];
                    j++;
                }
            }
            return i+1;
        }
    }
    
}
