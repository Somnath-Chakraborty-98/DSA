public class OneToN {

    static void solution(int n) {

        if (n == 0)
            return;

        solution(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        solution(5);
    }
}
