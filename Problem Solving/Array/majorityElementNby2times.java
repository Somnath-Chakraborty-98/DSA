public class majorityElementNby2times{
    class Solution {
        public int majorityElement(int[] arr) {
            
            int count =0;
            int ele =0;
            
            for(int i=0;i<arr.length;i++){
                if(count == 0) ele = arr[i];
                
                if(arr[i] == ele) count++;
                
                else count--;
            }
            
            return ele;
            
            
        }
    }
}