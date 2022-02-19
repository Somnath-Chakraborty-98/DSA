import java.util.Arrays;

public class maxProduct {
    public int[] maximumProduct(int arr[]){
        Arrays.sort(arr);
        
        return arr;
    }


    public static void main(String[] args) {
        maxProduct obj=new maxProduct();
        int arr[]={10,20,30,40,50};
        int ar[]=obj.maximumProduct(arr);
        System.out.println(ar[arr.length-2]+", "+ ar[arr.length-1]);
    }
}


// Find maxProduct using i, j - O(n^2)
