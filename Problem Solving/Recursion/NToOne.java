public class NToOne {

    static void solution(int n) {

        if (n == 0)
            return;

        System.out.print(n + " ");
        solution(n - 1);
    }

    public static void main(String[] args) {
        solution(5);
    }
}
