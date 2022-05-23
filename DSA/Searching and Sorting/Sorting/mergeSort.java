import java.util.Arrays;

public class mergeSort {
    
    void MergeSort(int arr[], int start, int end){ // Dividing and sending for Sorting
        if(end - start == 1) return;

        int mid = (start + end )/2;
        MergeSort(arr, start, mid);
        MergeSort(arr, mid, end);

        merge(arr, start, mid, end);
    }

    void merge(int[] arr, int s, int m, int e){        //Sorted Merging
        int[] mix = new int[e - s];

        int i=s, j=m, k=0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            } else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l] = mix[l];
        }
    }





    public static void main(String[] args) {
        int arr[]={5,9,6,10,51,49,65,1,4,2,11,14};
        mergeSort ms= new mergeSort();
        ms.MergeSort(arr,0,arr.length);
        System.out.print("Sorted Array :- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}





/*
int [] MergeSort(int arr[]){ // Dividing and sending for Sorting
        if(arr.length == 1) return arr;

        int mid = arr.length/2;
        int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    int[] merge(int[] first, int[] second){        //Sorted Merging
        int[] mix = new int[first.length + second.length];

        int i=0, j=0, k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            } else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
*/