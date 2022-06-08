public class nextPermutation {
    class Solution {
        public void nextPermutation(int[] arr) {
            
            if(arr == null || arr.length <= 1) return;
            
            int i = arr.length-2;                               //Strat of array
            
            while(i>=0 && arr[i] >= arr[i+1]) i--;              //Finding the break Point
            
            if(i>=0){
                int j = arr.length-1;
                while(arr[j]<= arr[i]) j--;                     //Finding just greater number than arr[i] as we start from the back whenever we find arr[j]>arr[i] it will be the                                                                                                                                                               immideate greater number
                swap(arr, i, j);
            }
            reverse(arr, i+1, arr.length-1);                    //This will deal with bothe if we have to reverse the whole array as there will be no next permutation or just a part                                                                                                                                                                   after the swap
         
            
        }
        
        void swap(int arr[], int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        void reverse(int arr[], int i, int j){
            while(i<j) swap(arr, i++, j--);              //Reverse array by using two pointer swap 
        }
        
        
    }
}
