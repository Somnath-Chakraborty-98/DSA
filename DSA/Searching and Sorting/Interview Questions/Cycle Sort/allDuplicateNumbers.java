import java.util.Arrays;

public class allDuplicateNumbers {

    void ans(int[] arr){
        int i=0;
        while(i<arr.length){
            int j = arr[i] - 1;
            if(arr[i] != arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else i++;
        }
    }


    public static void main(String[] args) {
        allDuplicateNumbers dn= new allDuplicateNumbers();
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};
        dn.ans(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i] != i+1){
                System.out.println(arr[i]);
            }
        }
    }
    
}
