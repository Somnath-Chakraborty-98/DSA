public class gcd {
    public int divisor(int x, int y){
        if(y==0) return x;
        else return divisor(y, x%y);
    }

    public static void main(String[] args) {
        gcd obj=new gcd();
        int x=12;
        int y=8;
        System.out.println("GCD ="+obj.divisor(x, y));
    }
}




/*
Euclidean Algorithm
gcd(a,0)=a;
gcd(a,b)=gcd(b,a%b);
*/