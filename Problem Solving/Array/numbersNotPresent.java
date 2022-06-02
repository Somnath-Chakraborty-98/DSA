public class numbersNotPresent {

    void ans(int arr[]){
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
        numbersNotPresent np = new numbersNotPresent();
        int arr[] = {6,7,4,4,2,8,1,7};
        np.ans(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] != i+1){
                System.out.println(i+1);
            }
        }
    }
}
