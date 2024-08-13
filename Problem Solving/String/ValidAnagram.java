import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    Boolean solution(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        int n;
        for (char ch : s.toCharArray()) {
            n = 1;
            if (true == map.containsKey(ch))
                n = map.get(ch) + 1;

            map.put(ch, n);
        }

        for (char ch : t.toCharArray()) {

            if (true == map.containsKey(ch)) {
                n = map.get(ch) - 1;
                if (n > 0)
                    map.put(ch, n);
                else
                    map.remove(ch);
            } else
                return false;
        }

        if (false == map.isEmpty())
            return false;

        return true;
    }

    Boolean solution2(String s, String t) {

        int len = s.length();
        if (len != t.length())
            return false;

            int[] count = new int[26];
        
            // Count the frequency of characters in string s
            for (char x : s.toCharArray()) {
                count[x - 'a']++;
            }
            
            // Decrement the frequency of characters in string t
            for (char x : t.toCharArray()) {
                count[x - 'a']--;
            }
            
            // Check if any character has non-zero frequency
            for (int val : count) {
                if (val != 0) {
                    return false;
                }
            }
            
            return true;
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();

        if (true == va.solution2("aacc", "ccac"))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
