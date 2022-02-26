import java.util.Arrays;

public class BestScores {
    public String firstSecond(int[] arr){
        int n=arr.length;
        int[] maxArr={arr[0],arr[0]};
        
        Arrays.sort(arr);
        maxArr[0] = arr[n-1];
        maxArr[1] = arr[n-2];
        return (Arrays.toString(maxArr)); 
    }


    public static void main(String[] args){
        BestScores obj=new BestScores();
        int[] arr={1,5,8,3,9,5,0,2};
        System.out.println(obj.firstSecond(arr));
    }
}
