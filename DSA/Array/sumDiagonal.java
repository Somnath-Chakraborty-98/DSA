public class sumDiagonal {
    public int exe(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
        }
        return sum;
    }

    public static void main(String[] args){
        sumDiagonal obj = new sumDiagonal();
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(obj.exe(arr));
    }
}
