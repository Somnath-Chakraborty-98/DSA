import java.util.Stack;

public class ValidParentheses {

    Boolean solution(String s) {

        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            } else {
                if (st.empty())
                    return false;
                char top = st.peek();
                if (ch == ']' && top == '[' ||
                        ch == '}' && top == '{' ||
                        ch == ')' && top == '(') {
                    st.pop();
                } else
                    return false;
            }
        }

        return st.empty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();

        if (true == vp.solution("()[]{}"))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
