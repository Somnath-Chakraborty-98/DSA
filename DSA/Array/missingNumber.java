import java.util.*;
public class missingNumber{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,8,9,10};
        /*for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +"="+(i+1));
            if(arr[i]!=i+1) {
                System.out.println("Missing number= "+(i+1));
                break;
            }
        }*/
        int n=arr.length;
        int actualLength=n+1;
        int actualSum=actualLength*(actualLength+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Missing Number= "+(actualSum-sum));
    }
}