public class insertionSort {
    

    void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j] =arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }




    public static void main(String[] args) {
        int arr[]={5,9,6,10,51,49,65,1,4,2,11,14};
        insertionSort is= new insertionSort();
        is.sort(arr);
        System.out.print("Sorted Array :- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
