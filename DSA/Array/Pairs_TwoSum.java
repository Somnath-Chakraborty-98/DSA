import java.util.*;
public class Pairs_TwoSum {

    public int[] pairs(int arr[], int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target) return new int[] {i, j};
            }
        }
        System.out.println("No Pairs Found");
        return new int[] {};
    }

    public static void main(String[] args){
      Pairs_TwoSum obj=new Pairs_TwoSum();
      int arr[]={2,7,13,15};
      int target=21;
      int ar[]=obj.pairs(arr, target);  
      System.out.println(Arrays.toString(ar));
    }
}
