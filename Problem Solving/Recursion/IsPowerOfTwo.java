public class IsPowerOfTwo {
    
    static boolean solution(int n){
        if(n == 0 || n == 1)
            return true;
        
        if(n % 2 != 0)
            return false;
        
        return solution(n/2);
    }


    public static void main(String[] args) {
        System.out.println(IsPowerOfTwo.solution(64));
    }
}
