import java.util.Arrays;

public class setMismatch {
    
    int[] mismatch(int arr[]){
        int i=0;
        while(i<arr.length){
            int j = arr[i] - 1;
            if(arr[i] != arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else i++;
        }

        for(int k=0;k<arr.length;k++){
            if(arr[k] != k+1){
                return new int[] {arr[k], k+1};
            }
        }
        return new int[] {-1};
        
    }


    public static void main(String[] args) {
        setMismatch sm = new setMismatch();
        int[] arr={4, 1, 4, 2, 6, 5};
        int[] ar=sm.mismatch(arr);
        System.out.println(Arrays.toString(ar));
    }
}
