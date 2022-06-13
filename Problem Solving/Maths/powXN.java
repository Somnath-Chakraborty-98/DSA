public class powXN{
    class Solution {
        public double myPow(double x, int n) {
            
            double ans = 1;
            long nn=n;         //use nn because n is integer and it's +ve limit is less than it's -ve limit
            
            if(nn<0) nn=-1*nn;
                
            while(nn>0){
                if(nn%2 == 0){
                    x=x*x;
                    nn=nn/2;
                }
                else {
                    ans = ans * x;
                    nn=nn-1;
                }
            }
            
            if(n<0) ans=(double)(1.0) / (double)(ans);
            
            return ans;
            
        }
    }
}