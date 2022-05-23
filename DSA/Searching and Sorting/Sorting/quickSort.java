import java.util.Arrays;

public class quickSort {

    void sort(int[] arr, int low, int high){
        if(low > high) return;

        int s = low;
        int e = high;
        int mid = s + (e - s)/2;
        int pivot = arr[mid];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr, s, high);

    }

    public static void main(String[] args) {
        int arr[]={5,9,6,10,51,49,65,1,4,2,11,14};
        quickSort qs= new quickSort();
        qs.sort(arr, 0, arr.length-1);
        System.out.print("Sorted Array :- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
