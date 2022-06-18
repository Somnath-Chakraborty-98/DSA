public class maxConsecutive1s {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxLen = 0, len = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] == 1) len++;
                else if(nums[i] == 0) len = 0;
                
                
                if(len> maxLen) maxLen = len;
            }
            
            
            return maxLen;
        }
    }
}
