public class selectionSort {


    void sort(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }




    public static void main(String[] args) {
        int arr[]={5,9,6,10,51,49,65,1,4,2,11,14};
        selectionSort ss= new selectionSort();
        ss.sort(arr);
        System.out.print("Sorted Array :- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
