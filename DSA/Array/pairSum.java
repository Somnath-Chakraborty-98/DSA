public class pairSum {

    public String pairs(int[] arr,int target){
        String outputStr=" ";
        for(int i=0;i<arr.length-1;i++){
            int sum=target-arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==sum) outputStr+=arr[i]+":"+arr[j]+" ";
            }
        }
        return outputStr;
    }

    public static void main(String[] args) {
        pairSum obj=new pairSum();
        int[] arr={2,4,3,5,6,-2,4,7,8,9};
        int target=7;
        System.out.println(obj.pairs(arr,target));
    }
    
}
