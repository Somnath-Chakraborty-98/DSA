import java.util.Arrays;

public class merge2SortedArray {
    class Solution1 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int j=0;
           for(int i=m;i<m+n;i++){
               nums1[i] = nums2[j];
               j++;
           } 
            
            Arrays.sort(nums1);
        }
    }



    class Solution2 {
        public void merge(int[] arr1, int m, int[] arr2, int n) {  
            int p1=m-1;
            int i=m+n-1;
            int p2=n-1;
            
            while(p2>=0){
                
                if(p1>=0 && arr1[p1] > arr2[p2]){
                    arr1[i] = arr1[p1];
                    i--;
                    p1--;
                }
                
                else{
                    arr1[i]=arr2[p2];
                    p2--;
                    i--;
                }
            }
            
            
            
        }
    }
}
