import java.util.ArrayList;
import java.util.HashMap;

public class countSubarrayWithXOR {

    class Solution {
        public int solve(ArrayList<Integer> A, int B) {
            
            HashMap<Integer, Integer> frq = new HashMap<Integer, Integer>();
            
            int count = 0;
            int xorr = 0;
            
            int n = A.size();
            
            for(int i=0; i<n; i++){
                
                xorr = xorr ^ A.get(i);
                
                if(frq.get(xorr ^ B) != null) count= count + frq.get(xorr ^ B);
                
                if(xorr == B) count++;
                
                if(frq.get(xorr) != null) frq.put(xorr, frq.get(xorr) + 1);
                
                else frq.put(xorr, 1);
                
            }
            
            
            return count;
            
        }
    }
}
