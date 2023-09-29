public class SumOfDigits {
    
    static int solution(int n){

        if(n == 0)
            return 0;

        return (n%10) + solution(n/10);
    }


    public static void main(String[] args) {
        System.out.println(solution(123));
    }
}
