public class removeDuplicatesFromSortedArray{

    class Solution {
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