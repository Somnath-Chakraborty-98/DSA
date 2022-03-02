import java.util.*;
public class calculatePower {

public int power(int a, int b){
    if(b==0) return 1;
    else{
        return (a*power(a, b-1));
    }
}

    public static void main(String[] args) {
        calculatePower obj = new calculatePower();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values of a & b :");
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("a^b = "+obj.power(a, b));
    }
}
