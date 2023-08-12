public class FindTheSmallestLetterGreaterThanTarget{
    
    static char solution(char[] letters, char target){
        int start = 0, mid = 0;
        int end = letters.length - 1;

        while(start <= end)
        {
            mid = start + (end - start) / 2;

            if(target < letters[mid]) end = mid - 1;
            else start = mid + 1;
        }

        return letters[start % letters.length];
    }



    public static void main(String[] args) {
        char[] letters = {'d', 'f', 'l', 'm', 'q'};
        char target = 'e';

        char ans = FindTheSmallestLetterGreaterThanTarget.solution(letters, target);

        System.out.println(ans);
    }
}
