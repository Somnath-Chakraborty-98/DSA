public class cycleSort {
    
    void sort(int[] arr){
        
        int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else i++;
        }
    }

    public static void main(String[] args) {
        int arr[]={3,5,2,1,4};
        cycleSort cs= new cycleSort();
        cs.sort(arr);
        System.out.print("Sorted Array :- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
