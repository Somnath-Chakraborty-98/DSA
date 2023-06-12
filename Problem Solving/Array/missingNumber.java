import java.util.Arrays;

public class missingNumber{

    class Solution2 {
        public int missingNumber(int[] arr) {
            int i=0;
            while(i<arr.length){
                int j = arr[i];             //[storing own index]Correct position as it is starting from 0 no -1
                if(arr[i]<arr.length && arr[i] != arr[j]){
                    swap(arr,i, j);
                } else i++;
            }
            
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=j) return j;
            }
            return arr.length;
        }
        
        void swap(int arr[], int a, int b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
    }







    class Solution1 {
        public int missingNumber(int[] arr) {
            Arrays.sort(arr);
            int i;
            
            for(i=0;i<arr.length;i++){
                if(arr[i] != i) return i;
            }
            return i;
        }
    }
}