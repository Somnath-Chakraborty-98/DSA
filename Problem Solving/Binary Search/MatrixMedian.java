public class MatrixMedian {

    public int findMedian(int[][] A) {
        int n = A.length, m = A[0].length;
        int low =0, high = Integer.MAX_VALUE;
        int ans = 0;

        while(low <= high){
            int mid = low+(high-low)/2;
            int count =0;

            for(int i=0; i<n; i++) count += fun(A[i], mid);
            if(count <= (n*m)/2){
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
        
    }
    int fun(int a[], int x){
        int low = 0, high = a.length-1;
        int size = 0;
        
        while(low <= high){
            int mid = low +(high - low) / 2;
            if(a[mid] < x){
                low = mid + 1;
                size = mid + 1;
            }else high = mid - 1;
        }
        return size;
    }
}
