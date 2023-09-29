public class FibonacciNumber
{
    static int solution(int n){

        if(n <= 1)
            return n;

        return solution(n-1) + solution(n-2);

    }


    public static void main(String[] args) {
        System.out.println(FibonacciNumber.solution(6));
    }
}