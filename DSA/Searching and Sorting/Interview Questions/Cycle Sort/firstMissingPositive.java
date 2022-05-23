public class firstMissingPositive {


    int missingPoitive(int[] arr){
        int i=0;
        while(i<arr.length){
            int j = arr[i] - 1;
            if(arr[i] >0 && arr[i]<arr.length && arr[i] != arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else i++;

        }
        for(int k=0;k<arr.length;k++){
            if(arr[k] != k+1){
                return k+1;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        firstMissingPositive fmp = new firstMissingPositive();
        int[] arr={7, 8, 9, 13, 14};
        int n=fmp.missingPoitive(arr);
        System.out.println(n);
    }
}
