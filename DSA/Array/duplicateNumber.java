import java.util.Arrays;

public class duplicateNumber {
    public int[] removeDuplicate(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=i+1){
                arr[i]=arr[i+1];
            }
        }
        return arr;
    }

    public static void main(String[] args){
        duplicateNumber obj = new duplicateNumber();
        int arr[]={1,2,3,3,4,5};
        int[] arr1=obj.removeDuplicate(arr);
        int n=arr1.length;
        for(int i=0;i<n-1;i++) System.out.print(arr[i]+ " ");
    }
    
}
