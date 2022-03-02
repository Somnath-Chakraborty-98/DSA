public class factorial{

    
    public int fact(int n){
        if(n==0) return 1;
        else{
            return (n*fact(n-1));
        }
    }

    public static void main(String[] args) {
        factorial obj=new factorial();
        int n=5;
        System.out.println(obj.fact(n));
    }
}