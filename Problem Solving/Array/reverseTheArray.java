import java.util.Arrays;

public class reverseTheArray { //Recursion


    void reverse(int arr[], int start, int end){
        int temp;

        if(start>=end) return;

        temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reverse(arr, start+1, end-1);
    }


    public static void main(String[] args) {
        reverseTheArray obj= new reverseTheArray();

        int arr[]={5,3,7,9,1,0,4};
        obj.reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
