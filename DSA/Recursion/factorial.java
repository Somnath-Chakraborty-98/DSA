public class factorial{

    int f=1;
    public int fact(int n){
        if(n==0) return f;
        else{
            f*=n;
            return (fact(n-1));
        }
    }

    public static void main(String[] args) {
        factorial obj=new factorial();
        int n=5;
        System.out.println(obj.fact(n));
    }
}