import java.util.Arrays;

public class RotateMatrix {
    
    public boolean Rotate(int[][] arr){
        if(arr.length ==0 || arr.length!= arr[0].length) return false;

        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
            }
        }
    }

    public static void main(String[] args){
        RotateMatrix obj=new RotateMatrix();
        int[][] arr={{}};
        
    }
}



/* for(int i=0;i< n/2; i++){
            int first = i;
            int last = n-1-i;

            for(int j=first;j<last;j++){
                int offset = j-first;
                int top = arr[first][i];
                arr[first][i] = arr[last-offset][first];
                arr[last-offset][first] = arr[last][last-offset];
            }
        } */