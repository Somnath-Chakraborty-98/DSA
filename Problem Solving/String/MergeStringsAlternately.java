
public class MergeStringsAlternately {
    
    String Solution(String word1, String word2)
    {
        String result = "";

        int n = word1.length();
        int m = word2.length();

        char ch;
        int i = 0, j = 0;
        while(i < n || j < m)
        {
            if(i < n){
                ch = word1.charAt(i);
                result += ch;
                i++;
            } 
            else if (j < m)
            {
                result += word2.substring(j);
                break;
            }

            if(j < m){
                ch = word2.charAt(j);
                result += ch;
                j++;
            }
            else if (i < n)
            {
                result += word1.substring(i);
                break;
            }

        }

        return result;
    }

    String Solution2(String word1, String word2)
    {
        String result = "";

        int n = word1.length();
        int m = word2.length();

        char ch;
        int i = 0, j = 0;
        while(i < n || j < m)
        {
            if(i < n){
                ch = word1.charAt(i);
                result += ch;
                i++;
            } 

            if(j < m){
                ch = word2.charAt(j);
                result += ch;
                j++;
            }

        }

        return result;
    }


    String Solution3(String word1, String word2)
    {
        String result = "";
        // reasult.append 
        int n = word1.length();
        int m = word2.length();

        char ch;
        int i = 0, j = 0;
        while(i < n && j < m)
        {
            if(i < n){
                ch = word1.charAt(i);
                result += ch;
                i++;
            } 

            if(j < m){
                ch = word2.charAt(j);
                result += ch;
                j++;
            }
        }

        while(i < n)
        {
            result += word1.charAt(i);
            i++;
        }

        while(j < m)
        {
            result += word2.charAt(j);
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        
        MergeStringsAlternately s = new MergeStringsAlternately();

        String word1 = "abc";
        String word2 = "pqrs";

        System.out.println((s.Solution3(word1, word2)).toString());
            
    }
}
