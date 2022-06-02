public class kadanesAlgo {

    class Solution1 {
        public int maxSubArray(int[] arr) {
            
            if(arr.length == 1) return arr[0];
            int sum=0;
            int maxSum=arr[0];
            
            for(int i=0;i<arr.length;i++){
                sum=0;
                for(int j=i;j<arr.length;j++){
                    sum=sum+ arr[j];
                    if(sum>maxSum) maxSum=sum;
                }
            }
            return maxSum;
            
        }
    }




    class Solution2 {
        public int maxSubArray(int[] arr) {
            
            if(arr.length == 1) return arr[0];
            int sum=0;
            int maxSum=arr[0];
            
            
            for(int i=0;i<arr.length;i++){
                sum = sum + arr[i];
                
                if(sum>maxSum) maxSum=sum;              //Storing the MaximumSum
                
                if(sum<0) sum=0;                        // Making the Sum 0 as we found what the Maximum Sum could be and the rest will reduce only
                
                
            }
            
            
            return maxSum;
            
        }
    }
    
}
