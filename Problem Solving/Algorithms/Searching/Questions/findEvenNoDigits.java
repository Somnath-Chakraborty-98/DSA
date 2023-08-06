public class findEvenNoDigits {
    
    static int solution(int[] arr){
        int count = 0, noOfDigits;
        for(int n : arr){
            if(n < 0)
                n = n * -1;

            noOfDigits = numberOfDigits(n);

            if(noOfDigits % 2 == 0)
                count++;
        }
        return count;
    }

    static int numberOfDigits(int num){
        return (int)(Math.log10(num)) + 1;
    }

    public static void main(String[] args) {
        int arr[]= {12,345,7,9,133,5489,-1230, 16385};
        int evenDigit = findEvenNoDigits.solution(arr);
        System.out.println(evenDigit);
    }
}
