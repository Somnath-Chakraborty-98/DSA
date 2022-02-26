public class missNumber {
    public int exe(int[] arr, int totalCount){
        for(int i=0;i<totalCount;i++){
            if(arr[i]!=i+1) return (i+1);
        }
        return 0;
    }

    public static void main(String[] args){
        missNumber obj = new missNumber();
        int[] arr={1,2,3,4,6};
        System.out.println(obj.exe(arr, arr.length));
    }
}




/*
int n=arr.length;
        int actualLength=n+1;
        int actualSum=actualLength*(actualLength+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Missing Number= "+(actualSum-sum));
*/