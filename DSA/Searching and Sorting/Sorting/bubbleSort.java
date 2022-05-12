public class bubbleSort{


    void sort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }



    public static void main(String[] args) {
        bubbleSort bs = new bubbleSort();
        int arr[]={5,9,6,10,51,49,65,1,4,2,11,14};

        bs.sort(arr);
        System.out.print("Sorted Array :- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}