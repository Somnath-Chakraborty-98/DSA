public class maxWealth {
    
    private static char[] solution;

    static int solution(int[][] arr){
        int maxWealth = 0, currentCustomerWealth;
        for(int i = 0; i < arr.length; i++){
            currentCustomerWealth = 0;
            for (int wealth : arr[i]) {
                currentCustomerWealth += wealth;
            }

            if(maxWealth < currentCustomerWealth) maxWealth = currentCustomerWealth;
        }
       return maxWealth;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{2,3,1},{1,4,3},{2,2,1}};
        System.out.println(maxWealth.solution(arr));
    }
}
