import java.util.ArrayList;
import java.util.List;

public class majorityElementNby3times {
    class Solution {
        public List<Integer> majorityElement(int[] arr) {
            
            List<Integer> res = new ArrayList<Integer>(); 
            
            
            int num1=-1,num2=-1,count1=0,count2=0;
            
            for(int i=0; i<arr.length; i++){
                
                if(arr[i] == num1) count1 ++;
                
                else if(arr[i] == num2) count2 ++;
                
                else if(count1 == 0){
                    num1 = arr[i];
                    count1 = 1;
                }
                
                else if(count2 == 0){
                    num2 = arr[i];
                    count2 = 1;
                }
                
                else {
                    count1 --;
                    count2 --;
                }
            }
            
            count1 = 0;
            count2 = 0;
            
            for(int i=0; i<arr.length; i++){
                if(arr[i] == num1) count1 ++;
                
                else if(arr[i] == num2) count2 ++;
            }
            
            if(count1 > arr.length/3) res.add(num1);
            
            if(count2> arr.length/3) res.add(num2);
            
            return res;
            
            
        }
    }
}
