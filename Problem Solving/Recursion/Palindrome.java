public class Palindrome {

    static int sum = 0;
    static void rev(int n){

        if(n == 0)
            return;

        int rem = n % 10;
        sum = sum * 10 + rem;
        solution(n/10);
    }

    static boolean solution(int n){
        rev(n);
        return (n == sum);
    }


    public static void main(String[] args) {
        System.out.println(solution(55));
    }
}
