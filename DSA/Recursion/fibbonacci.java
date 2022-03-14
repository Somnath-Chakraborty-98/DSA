public class fibbonacci {

    static int series(int n){
        if(n<2) return n;
        return series(n-1)+series(n-2);
    }

    public static void main(String[] args) {
        int n;
        n=7;
        System.out.println(series(n));
    }
    
}
