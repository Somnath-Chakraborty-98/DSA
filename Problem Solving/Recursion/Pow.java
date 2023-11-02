public class Pow{

    static double calculate(int x, int n){
        if (x == 0)
            return 0;
        if(n < 0)
            n = -1 * n;

        if(n == 0)
            return 1;
        else
            return x * calculate(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(Pow.calculate(2, 5));
    }
}