public class ReverseANumber {
    static int sum = 0;
    static void solution(int n){

        if(n == 0)
            return;

        int rem = n % 10;
        sum = sum * 10 + rem;
        solution(n/10);
    }


    public static void main(String[] args) {
        solution(1924);
        System.out.println(sum);
    }
}
 