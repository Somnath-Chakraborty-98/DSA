public class stockBuySell {
    class Solution {
        public int maxProfit(int[] arr) {
            if(arr.length<=1) return 0;
            
            int min=arr[0],profit=0;
            
            
            for(int i=1;i<arr.length;i++){
                if(arr[i]<min) min = arr[i];
                
                if(profit < arr[i] - min) profit = arr[i] - min;
            }
            
            return profit;
            
        }
    }
}
