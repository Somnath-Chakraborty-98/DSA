

public class duplicateNumber {

    int ans(int[] arr){
        int i=0;
        while(i<arr.length){
            int j = arr[i]-1;
            if(arr[i] != arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else i++;
        }
        return arr[arr.length-1];
    }
    
    public static void main(String[] args) {
        duplicateNumber dn= new duplicateNumber();
        int arr[] = {4, 2, 1, 3, 2};
        int n = dn.ans(arr);
        System.out.println(n);
    }
}
