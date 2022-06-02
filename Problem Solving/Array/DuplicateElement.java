public class DuplicateElement {
    class Solution {
        public int findDuplicate(int[] arr) {
            int i=0;
            while(i<arr.length){
                int j = arr[i] -1;     //Correct Position if it starts from 1
                if(arr[i] != arr[j]){
                    swap(arr,i,j);
                } else i++;
            }
            
            
            return arr[arr.length-1];           //Duplicate element will be at the end of the array
            
            
        }
        
        void swap(int arr[], int a, int b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
    }
}
