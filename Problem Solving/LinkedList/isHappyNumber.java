public class isHappyNumber {
    void isHappyOrNot(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (fast != slow);

        if (slow == 1)
            System.out.println("True");
        else
            System.out.println("False");

    }

    private int findSquare(int num) {
        int ans = 0;
        while (num > 0) {
            int temp = num % 10;
            num = num / 10;
            ans += temp * temp;
        }
        return ans;
    }
}
