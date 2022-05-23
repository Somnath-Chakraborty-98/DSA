public class missingNumber{

    int ans(int[] arr){
        int i=0;
        while(i<arr.length){
            int j = arr[i];
            if(arr[i]<arr.length && arr[i] != arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else i++;
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k] != k) return k;
        }
        return arr.length;
    }


    public static void main(String[] args) {
        missingNumber mn= new missingNumber();
        int arr[] = {4, 0, 2, 1};
        int n = mn.ans(arr);
        System.out.println(n);
    }
}