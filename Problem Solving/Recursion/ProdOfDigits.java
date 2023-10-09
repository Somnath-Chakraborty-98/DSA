public class ProdOfDigits {
    static int solution(int n){

        if(n % 10 == n)
            return n;

        return (n%10) * solution(n/10);
    }


    public static void main(String[] args) {
        System.out.println(solution(55));
    }
}
