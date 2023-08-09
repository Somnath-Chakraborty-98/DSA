public class minNumber {
    
    static int solution(int[] arr)
    {
        if(arr.length == 0) return -1;
        
        int min = arr[0];
        for(int n : arr)
        {
            if(min > n) min = n;
        }
        return min;
    }


    public static void main(String[] args) {
        minNumber ls = new minNumber();
        int arr[]= {2,4,7,9,3,5,7};
        int minNum = minNumber.solution(arr);
        System.out.println(minNum);
    }
}
