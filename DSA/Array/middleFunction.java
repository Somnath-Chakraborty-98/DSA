import java.util.*;
public class middleFunction {
    public int[] exe(int[] arr){
        int n=arr.length;
        int[] arr1=new int[n-2];
        for(int i=1;i<n-1;i++){
            arr1[i-1]=arr[i];
        }
        return arr1;
    }
    public static void main(String[] args){
        middleFunction obj = new middleFunction();
        int arr[]={1,4,7,9,3,13,13};
        System.out.println(Arrays.toString(obj.exe(arr)));
    }
}
